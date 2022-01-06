package src.P7;

public class TestPerson {
    public static void main(String[] args) {
        Person2 p1 = new Person2("xdqiang",18);
        Person2 p2 = new Person2("xdqiang",18);
        Person2 p3 = new Person2("xdq",17);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));

    }



}

class Person2{
    String name;
    int age;
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean compareTo(Person2 p){
        return p.name.equals(this.name) && p.age == this.age;
    }
}