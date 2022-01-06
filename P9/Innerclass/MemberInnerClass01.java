package src.P9.Innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.hi();
        //外部其他类访问成员类
        Outer08.Inner08 inner08 = outer08.new Inner08();
        Outer08.Inner08 inner081 = outer08.getInner08();
        inner081.say();


    }
}

class Outer08{
    private final int n1 = 10;
    public String name = "zhang san";
    class Inner08{             //成员内部类（和外部类一样可以加修饰符，但是局部内部类不能加修饰符）
        double sal = 99.8;
        private final int n1 = 6;
        public void say(){
            System.out.println(n1);//就近访问
            System.out.println(Outer08.this.n1);//访问外部类成员
            System.out.println("成员内部类");
        }
    }
    public void hi(){
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);

    }
    //写一个方法返回成员类的实例
    public Inner08 getInner08(){
        return new Inner08();
    }
}