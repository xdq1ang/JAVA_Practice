package src.P14;

import java.util.ArrayList;

/*
 *   @author : xdqiang
 */
public class Generic02 {
    public static void main(String[] args) {
        //使用泛型解决问题
        ArrayList<Dog> arrayList = new ArrayList<Dog>();//集合中只能存放Dog
        arrayList.add(new Dog("旺财",1));
        arrayList.add(new Dog("发财",2));
        arrayList.add(new Dog("小黄",6));
        //arrayList.add(new Cat("小喵",6));//存放其他类型会报错
        for (Dog dog :arrayList) {//这里取出的时候也是Dog类型
            System.out.println(dog.getName()+":"+dog.getAge());
        }

    }
}

