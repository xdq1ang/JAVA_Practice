package src.P9.Innerclass;

/*
* 局部内部类的使用：
*
* */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02{
    private final int n1 = 100;
    private void m2(){
        System.out.println("Outer m2()");
    }
    public void m1(){
        //                    1. 局部内部类定义在外部类的局部位置，如方法,代码块中：
        class Inner02{//      3. 不能添加访问修饰符（可以用final修饰）
            public void f1(){
                System.out.println("n1="+n1);
                m2();//       2. 可以直接访问外部类的所有成员（包含私有的）
            }
        }
        class Inner03 extends Inner02{
        }

        Inner02 inner02 = new Inner02();
        inner02.f1();

    }
}
