package src.P10.homework;

/*
* 输出外部类得到属性：
* Outer.this.name
* */

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.test();
    }
}

class A{
    private final String NAME ="zzz";
    public void test(){
        class B{
            private final String name="xdqiang";
            public void show(){
                System.out.println(A.this.NAME);
            }
        }
        new B().show();
    }
}