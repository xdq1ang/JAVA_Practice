package src.P9.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{
    private int n2  = getN2();
    private static int n1 = getN1();
    static{
        System.out.println("A 静态代码块01");
    }
    {
        System.out.println("A 普通代码块被调用");
    }
    public static int getN1(){
        System.out.println("getN1()被调用");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2()被调用");
        return 100;
    }
    public A(){
        System.out.println("无参构造器被调用了");
    }
}