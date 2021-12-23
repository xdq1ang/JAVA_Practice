package src.P9.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //创建对象实例时，代码块（静态/非静态）会被执行，静态代码块只会执行一次。
        new AA();
        //创建子类对象实例时，父类代码块（静态/非静态）也会执行，如果父类静态代码块已经执行过，则不会在执行
        new BB();
        //直接使用类的静态成员时，静态代码块会被执行
        int n1 = Cat.n1;

    }
}

class AA{
    //静态代码块
    static{
        System.out.println("AA的静态代码块1被执行");
    }
    {
        System.out.println("AA的非静态代码块1被执行");
    }
}

class BB extends AA{
    static {
        System.out.println("BB的静态代码块1被执行");
    }
    {
        System.out.println("BB的非静态代码块1被执行");
    }
}

class Cat{
    public static int n1 = 999;
    static{
        System.out.println("Cat 的静态代码块被执行");
    }
}