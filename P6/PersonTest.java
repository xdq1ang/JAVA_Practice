package src.P6;
public class PersonTest{
    public static void main(String[] args) {
        Person p = new Person("xdqiang",12);
        Person p1 = copyPerson.copy(p);
        System.out.println("是不是同一个对象?:"+p.equals(p1));
        System.out.println(p1.name);
        System.out.println(p1.age);

        String s2 = "xdqiang";
        String s1 = "xdqiang";
        String s3 ="xdqiang";
        String s4 = "xdqiang";
        /*
        *   ==  : 可以判断基本数据类型（比较的是内容），引用类型（比较的是哈希值）
        * equals：只能判断引用类型（特殊对象String,data,file比较的是内容。常规对象比较的是对象哈希值）
        * */
        System.out.println(p==p1);//==判断的是否为同一对象
        System.out.println(p.equals(p1));//==判断的是否为同一对象
        System.out.println(s1.equals(s4));
        System.out.println(s1==s4);
    }

}

class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

}

class copyPerson{
    public static Person copy(Person p){
        String name=p.name;
        int age = p.age;
        Person p1 = new Person(name,age);
        return p1;
    }
}
