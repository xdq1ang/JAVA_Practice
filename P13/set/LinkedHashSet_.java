package src.P13.set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 *   @author : xdqiang
 */
public class LinkedHashSet_ {
    public static void main(String[] args) {
        /*
        * 1.元素添加顺序和输出顺序一致
        * 2.底层是LinkedHashMap(是LinkedHashMap的子类)，维护了一个数组(HashMap$Node)，数组中保存的是LinkedHashMap$Entry(LinkedHashMap$Entry与HashMap$Node有继承或实现关系)
        * 3.第一次添加会直接把数组扩容到16
        *
        *
        * */
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("xdqiang",1001));
        set.add(123);
        set.add("HSP");
        System.out.println(set);

    }

}
class Customer{
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
