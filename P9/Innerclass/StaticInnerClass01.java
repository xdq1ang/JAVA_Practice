package src.P9.Innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        //外部其他类访问静态成员类
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        Outer10.Inner10 inner101 = new Outer10().getInner10();
        inner101.say();




    }
}

class Outer10{
    private final int n1 =10;
    private static final String name="zhang san";
    private static void cry(){}
    //静态内部类
    static class Inner10{
        private static final String name = "xdqiang";
        public void say(){
            cry();
            System.out.println(name);//可以访问外部类静态成员
            System.out.println(Outer10.name);
        }

    }
    public void m1(){
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10(){
        return new Inner10();
    }
}
