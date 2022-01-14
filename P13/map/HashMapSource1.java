package src.P13.map;

import java.util.HashMap;

/*
 *   @author : xdqiang
 */
public class HashMapSource1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java",10);
        map.put("php",10);
        map.put("java",20);
        System.out.println("map="+map);
        //HashMap源码分析
        /*
        * 1.执行构造器 new HashMap()。初始化加载因子loadFactor=0.75。HashMap$Node[] table = null
        * 2.执行put(Hash(key),value)方法。Hash(key)返回hash值。
        * 3.执行putVal():如果table为null就立即创建大小为16的table。
        * 4.根据Hash值计算一个索引值
        * 5.判断该索引是否为空（空则直接存入），不空则判断是树还是链表。然后用对应的方法插入元素。如果链表的元素达到8且HashMap总共元素个数超过64则进行树化，否则对HashTable进行扩容
        *
        *
        * */


    }
}
