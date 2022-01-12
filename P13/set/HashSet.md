# HashSet说明
1. 实现了Set接口
2. 底层实际上是HashMap，hashmap底层是**数组+链表+红黑树**
3. 可以存放null值
4. HashSet不保证元素存储和取出顺序一致（取决于hash后顺序）
5. 不能有重复的元素

![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/MIK-gEx5n2.png)

# hashSet方法
- add()添加元素，成功则返回true，失败则返回false
- remove()删除第一个元素并返回

# HashSet（底层是HashMap）添加元素
1. 添加一个元素时会计算hash值，hash值会转化为索引值(这个hash值不等于hashcode)
2. 找到存储数据的table，看这个索引位置是否已经存放有元素
3. 如果没有则直接加入
4. 如果有则调用equals比较：相同则放弃添加，不同则添加到最后
5. 在Java8中如果一条链表的元素个数超过TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认是64)就会进行树化（红黑树）

//添加相同对象或者内容相同的字符串：
```java
public class HashMap<K,V> extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable {
    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            //哈希值相同并且为同一对象 或 待添加元素值不是null且和hashtable该位置元素内容相同
            //则不能加入
            if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            //判断是不是红黑树，如果是则按照红黑树的方法添加putTreeVal
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {//在链表上循环执行第一个if
                for (int binCount = 0; ; ++binCount) {//死循环
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        //如果节点数大于8  则对当前链表进行树化（但是不会立即树化，会判断table的大小是否大于64，否则扩容，是则树化）
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }
}
```

# HashSet扩容机制
1. HashSet底层是HashMap，第一次添加时，table数组扩容到16，临界值(threshold)=16*loadFactor(加载因子0.75)=12
2. 如果节点个数（所有链表元素个数之和）达到了临界值12就会扩容到16\*2=32，新的临界值就是 32*0.75=24
3. 在Java8中如果一条链表的元素个数达到TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认是64)，就会进行树化（红黑树），否则仍然采用数组扩容机制。
