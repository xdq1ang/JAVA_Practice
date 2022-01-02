package src.P10.homework;

public class Homework03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shut();
        dog.shut();

    }
}
abstract class Animal{
    abstract public void shut();
}
class Cat extends Animal{

    @Override
    public void shut() {
        System.out.println("猫会喵喵叫！！！");
    }
}
class Dog extends Animal{

    @Override
    public void shut() {
        System.out.println("狗会往往叫！！！");
    }
}