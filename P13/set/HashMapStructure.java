package src.P13.set;

/*
 *   @author : xdqiang
 */
public class HashMapStructure {
    public static void main(String[] args) {
        //创建一个数组，数组类型是Node
        Node[] table = new Node[16];
        System.out.println(table);
        Node john = new Node("john", null);
        Node jack = new Node("jack", null);
        Node rose = new Node("rose", null);
        table[2]= john;
        john.next=jack;
        jack.next=rose;

        Node lucy = new Node("lucy", null);
        table[3]=lucy;


    }
}

class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
