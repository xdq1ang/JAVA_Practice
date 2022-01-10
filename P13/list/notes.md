![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-10-img.png)

# ArrayList源码分析
- ArrayList维护了一个Object类型的数组elementData（`transient Object[] elementData`，transient表示瞬间，短暂的，该属性不会被序列化）
- 创建ArrayList对象时，如果使用的是无参构造器，**则初始elementData容量为0，第一次添加则扩容到10**，如果需要再次扩容则扩容到1.5倍。
- 如果使用的是指定大小的构造器，则初elementData始化容量大小为指定大小，如果需要扩容就直接扩容到1.5倍。

## 源码分析：
### 1.未指定ArrayList大小：
![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-10-img_3.png)
1. 先创建一个空数组
2. 添加元素时判断是否为空数组，空则直接扩容到10
3. 添加新元素。。。
4. 如果总元素个数==数组容量，就创建新数组（大小为原数组的1.5倍），把原数组的元素复制到新数组中(Arrays.copyOf())。

### 2.指定ArrayList大小
1. 直接创建指定大小的数组
2. 不够则扩容到1.5倍
![](https://gitee.com/xdqiang/picbed/raw/master/IDEA_imgs/2022-01-10-img_4.png)
