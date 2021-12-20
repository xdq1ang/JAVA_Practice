package src.P8.homework11;

public class Homework11 {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();

        //student向上转型
        ((Person)student).run();//子类重写了父类的方法，方法运行时
        ((Person)student).eat();//未重写
        //((Person)student).study();这个方法在父类中不存在


    }
}
class Person{

    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}
class Student extends Person{
    @Override
    public void run() {
        System.out.println("student run");
    }

    public void study() {
        System.out.println("student study...");
    }
}