package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="hspedu";
        Person p2 = new Person();
        p2.name = "hspedu";

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name==p2.name);       //true
        System.out.println(p1.name=="hspedu");      //true

        String s1 = "bcde";
        String s2 = "bcde";
        System.out.println(s1==s2);                 //false
    }
}


class Person{
    String name;
}