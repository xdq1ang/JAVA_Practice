package src.P8;

public class OverrideExercise {
    public static void main(String[] args) {
        System.out.println(new Student("xdqiang",22,"112020321001236","99.6").say());

    }
}
class Person{
    private final String name;
    private final int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String say(){
        return"我的名字是："+name+" 年龄："+age;
    }
}
class Student extends Person{
    private final String id;
    private final String score;
    public Student(String name,int age,String id,String score){
        super(name,age);
        this.id = id;
        this.score = score;
    }
    @Override
    public String say(){
        return super.say()+" id:"+id+" score:"+score;
    }
}
