package src.P13.list;

import java.util.ArrayList;
import java.util.List;

/*
 *   @author : xdqiang
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加元素，插入元素
        list.add("xxx");
        list.add("yyy");
        list.add(1,"刘备");
        System.out.println(list);
        //把一个集合中所有元素添加
        list.addAll(1,list);
        //返回集合中元素第一次出现的索引
        System.out.println(list.indexOf("yyy"));
        //返回元素最后一次出现的索引
        System.out.println(list.lastIndexOf("yyy"));
        //移除指定索引元素
        list.remove(0);
        System.out.println(list);
        //替换指定索引元素
        list.set(1,"嘛");
        System.out.println(list);
        //返回子串
        List list1 = list.subList(1,3);
        System.out.println(list1);







    }
}
