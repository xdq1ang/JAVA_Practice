package src.P8.dynamicbinding;

/*
* java动态绑定机制
* 1. 当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
* 2. 当调用对象的属性时候，没有动态绑定机制，哪里声明就在哪里使用
*
*
* */

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//40
        System.out.println(a.sum1());//30

    }
}
class A{
    public int i = 10;
    public int sum(){
        return sum1()+10;
    }
    public int sum1(){
        return i+10;
    }
    public int getI(){
        return i;
    }

}
class B extends A{
    public int i = 20;
//    public int sum(){
//        return i+20;
//    }
    public int getI(){//会覆盖父类中的方法
        return i;
    }
    public int sum1(){//会覆盖父类中的方法
        return i+10;
    }

}
