package src.P8.poly.objectpoly;

public class Test {
    public static void main(String[] args) {
        Animal animal  = new Dog();
        animal.cry();//animal的运行类型是Dog,所以这个cry()是Dog的
        animal = new Cat();//animal的编译类型是animal，运行类型是Cat
        animal.cry();
    }
}
