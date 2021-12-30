package src.P9.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal{
    /*
    * 当一个类中存在抽象方法时，需要把该类定义为抽象类
    * 由子类实现抽象方法
    *
    * */
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("Cat eat");
    }
}
