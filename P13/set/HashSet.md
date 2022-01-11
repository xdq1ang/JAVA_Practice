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