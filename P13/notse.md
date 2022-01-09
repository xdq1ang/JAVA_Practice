# 数组的缺点：

1. 创建数组时必须指定长度，不能更改
2. 保存的必须是同一类型的元素
3. 对数组进行扩容，增删改查比较麻烦

# 集合的优点

1. 可以动态保存任意多个对象，使用比较方便
2. 提供了一些列方便的操作对象的方法：add(),remove(),set(),get()
3. 增删改查更简单


# 继承关系
- 单列集合

![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-09-img.png)

- 双列集合

![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-09-img_1.png)

# 集合分类
- 单列集合：存储的是单个对象
- 双列集合：存储的是键值对

# Collection接口和常用方法
1. collection实现子类可以存放多个元素，可以是object
2. 有些collection的实现类可以存放重复元素，有些不可以
3. 有些collection的实现类是有序的，有些是无序的(Set)
4. Collection接口没有直接的实现子类，是通过它的子接口Set和List来实现的

## Collection的实现类可以通过迭代器遍历元素
![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-09-img_2.png)
![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-09-img_3.png)

当退出while循环后，这是iterator指向了最后的元素，再执行.next()会抛出异常。
如果希望再次遍历需要重置迭代器
