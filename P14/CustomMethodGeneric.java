package src.P14;

/*
 *   @author : xdqiang
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car<String> car = new Car<String>();
        car.fly("baoma","good");//当调用方法时传递参数时，确定T和R的类型

    }
}

class Car<E>{                   //泛型方法
    public void run(E e){}      //普通方法使用了泛型
    public <T,R> void fly(T t,E e) {   //泛型方法
        System.out.println("T的类型："+t.getClass());
        System.out.println("E的类型："+e.getClass());
    }
}
