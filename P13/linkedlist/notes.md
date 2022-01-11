# linkedList的说明
1. linkedList底层实现了双向链表和双端队列特点。
2. 可以添加任意元素（元素可以重复），包括null。
3. 线程不安全，没有实现同步。
![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/MIK-dgeBvc.png)

# ArrayList和linkedList比较

|            | 底层结构 | 增删效率      | 改查效率 |
|------------|------|-----------|------|
| ArrayList  | 可变数组 | 较低（数组扩容）  | 较高   |
| linkedList | 双向链表 | 较高，通过链表追加 | 较低   |

如何选择ArrayList和linkedList ?
1. 改查操作多，选择ArrayList（可以通过索引直接定位）
2. 增删操作多，选择LinkedList
3. 一般来说程序中80到90的概率都是查询，因此大部分情况选择ArrayList
4. 在一个项目中需要根据项目灵活选择。
5. ArrayList和linkedList都是线程不安全的。


