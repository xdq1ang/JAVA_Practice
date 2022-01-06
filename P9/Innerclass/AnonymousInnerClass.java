package src.P9.Innerclass;


/*
* 匿名内部类的使用
*
* */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        new Outer04().method();

    }
}

class Outer04{
    private final int n1 = 10;
    public void method(){
        //基于接口的匿名内部类
        //1.需求：传统实现IA接口需要创建类并实现该接口然后创建对象。然而如果这个类只使用一次以后不再使用（可以使用匿名内部类简化）。
        IA tiger = new IA(){//接口本身不能实例化，但是后面的语句实现了抽象方法
            @Override
            public void cry() {
                System.out.println("老虎叫！");
            }
        };
        tiger.cry();
        System.out.println("运行类型为："+tiger.getClass());
        //分析：
        //tiger的编译类型是IA接口，tiger运行类型就是这个匿名内部类（类名称为Outer04$1）

        //基于类的匿名内部类
        Father father = new Father("jack"){//参数会传递给Father构造器。（一般匿名内部类没不重写构造器）
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father的运行类型："+father.getClass());
        father.test();
        //分析：
        //编译类型：Father，运行类型（Outer04.$2）
        //这个匿名内部类继承了Father
    }

}
interface IA{
    void cry();//public 可以不写
}
class Father{
    public Father(String name){

    }
    public void test(){

    }
}