package src.P7;

public class ConstructorExercise {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("xdqiang",21);
        System.out.println(p1.age);
        System.out.println(p2.name+" 年龄:"+p2.age);


    }



}

class Person1{
    int age;
    String name;
    public Person1(){
        this.age=18;
    }
    public Person1(String pName,int pAge){
        this.name = pName;
        this.age = pAge;
    }
}
