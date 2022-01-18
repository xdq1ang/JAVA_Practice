package src.P13.homework;

import java.util.HashSet;
import java.util.Objects;

/*
 *   @author : xdqiang
 */
public class Homework05 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person1 p1 = new Person1("1001", "AA");
        Person1 p2 = new Person1("1002", "BB");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.setName("CC");//改变了name，但是存储位置之前已经定了。位置仍然是1001 AA的位置
        hashSet.remove(p1);//这里检索新p1的位置是否有元素（没有）
        System.out.println(hashSet);//1001,CC   1002,BB
        hashSet.add(new Person1("1001","CC"));
        System.out.println(hashSet);//1001,cc  1001,cc 1002 bb
        hashSet.add(new Person1("1001","AA"));//虽然新添加的1001AA与1001cc的位置冲突，但是equals比较结果不一样，添加的链表的末尾。
        System.out.println(hashSet);//1001 aa ,1001,cc,1001 cc , 1002 bb
    }
}

class Person1{
    private String name;
    private String id;

    public Person1(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(name, person1.name) && Objects.equals(id, person1.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
