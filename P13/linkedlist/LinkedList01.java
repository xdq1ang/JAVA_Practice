package src.P13.linkedlist;

import java.util.LinkedList;

/*
 *   @author : xdqiang
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node xdqiang = new Node("xdqiang");
        jack.next=tom;
        tom.next=xdqiang;
        tom.pre=jack;
        xdqiang.pre=tom;
        Node first = jack;
        Node last = xdqiang;

        //在链表中插入元素
        Node smith = new Node("smith");
        tom.next=smith;
        smith.next=xdqiang;
        xdqiang.pre=smith;
        smith.pre=tom;
        //遍历双向链表
        while(true){
            if(first==null){
                break;
            }
            System.out.println(first.toString());
            first=first.next;
        }


    }
}


class Node{
    public Object item;//存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向上一个节点
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name = "+item;
    }
}
