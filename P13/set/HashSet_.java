package src.P13.set;

import java.util.HashSet;
import java.util.Set;

/*
 *   @author : xdqiang
 */
public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println(hashSet.add((null)));
        //重新创建一个hashset,添加Dog对象
        hashSet = new HashSet();
        System.out.println(hashSet);
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        //经典面试题
        //这里new的String不能重复添加
        hashSet.add(new String("Dog"));
        hashSet.add(new String("Dog"));
        System.out.println(hashSet);


    }

}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
