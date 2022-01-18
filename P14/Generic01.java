package src.P14;

import java.util.ArrayList;

/*
 *   @author : xdqiang
 */
public class Generic01 {
    public static void main(String[] args) {
        //使用传统方法来解决
        /*
        * 1.不能对加入到集合中的数据类型进行约束（不安全）
        * 2.遍历的时候需要对数据进行转型，如果集合中的数据量较大会影响效率。
        *
        * */
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财",1));
        arrayList.add(new Dog("发财",2));
        arrayList.add(new Dog("小黄",6));
        arrayList.add(new Cat("小喵",6));
        for (Object o :arrayList) {
            if(o instanceof Dog){
                Dog dog = (Dog)o;//向下转型
                System.out.println(dog.getName()+"\t"+dog.getAge()+"岁");
            }else if(o instanceof Cat){
                Cat cat = (Cat)o;
                System.out.println(cat.getName()+"\t"+cat.getAge()+"岁");
            }

        }


    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat<S> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
