package src.P13.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *   @author : xdqiang
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        //源码阅读
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        //删除节点
        System.out.println(linkedList.remove());//删除第一个节点,并返回值
        //linkedList.remove(2);//删除第二个节点
        //修改节点
        linkedList.set(0,999);
        //得到某个给的的对象
        System.out.println(linkedList.get(0));
        //迭代器遍历
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println(linkedList);
    }
}
