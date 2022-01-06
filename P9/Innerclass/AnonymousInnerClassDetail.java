package src.P9.Innerclass;
/*
* 匿名内部类使用细节
* 1.同时具有创建类和创建对象的操作
*
*
*
* */


public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        new Outer05().f1();

    }
}
class Outer05{
    private final int n1 = 99;
    public void f1(){
        //调用方式1
        Person p =new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法（调用方式1）");
            }
        };
        p.hi();
        //调用方式2
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法（调用方式2）");
            }
        }.hi();
    }
}


class Person{  //可以是类，抽象类，接口
    public void hi(){
        System.out.println("Person hi()");
    }
}



