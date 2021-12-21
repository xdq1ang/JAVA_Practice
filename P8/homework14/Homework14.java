package src.P8.homework14;

public class Homework14 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A(){
        System.out.println("我是A类");
    }
}

class B extends A{
    public B(){
        //super()   会默认调用父类的无参数构造器
        System.out.println("我是B类的无参构造器");
    }
    public B(String name){
        //super()   会默认调用父类的无参数构造器
        System.out.println(name+"我是B类的有参构造器");
    }
}

class C extends B{
    public C(){
        this("hello");
        System.out.println("我是C类的无参数构造器");
    }
    public C(String name){
        super("hahaha");
        System.out.println("我是c类的有参数构造器");
    }
}
//我是A类
//hhh我是B类的有参构造器
//我是c类的有参数构造器
//我是C类的无参数构造器