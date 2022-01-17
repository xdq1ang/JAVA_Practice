package src.P13.homework;

import java.util.Comparator;
import java.util.TreeSet;

/*
 *   @author : xdqiang
 */
public class Homework04 {
    public static void main(String[] args) {
        //没有提供比较器时会试图寻找存入元素的compareTo()方法
        TreeSet treeSet_dog = new TreeSet();
        treeSet_dog.add(new Dog());
        treeSet_dog.add(new Dog());
        System.out.println(treeSet_dog);

        //提供比较器时会直接使用这个比较器来决定存储顺序
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Person p1 = (Person) o1;
                Person p2 = (Person) o2;
                return p1.hashCode()-p2.hashCode();
            }
        });
        treeSet.add(new Person());
        treeSet.add(new Person());
        System.out.println(treeSet);

    }
}

class Person{
    //没有提供比较器

}

class Dog implements Comparable{
    //实现Comparable接口
    @Override
    public int compareTo(Object o) {
        Dog d = (Dog) o;
        return this.hashCode()-d.hashCode();
    }
}
