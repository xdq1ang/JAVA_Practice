package src.P14;

/*
 *   @author : xdqiang
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
interface IUsb<U,R>{
    int n = 10;
    //U name = "f";   接口中的属性是public static final
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    //在jdk8中可以在接口中使用默认权限修饰方法
    default R method(U u){
        return null;
    }
}

interface IUsb2 extends IUsb<String,Double>{//继承接口时指定泛型类型

}
class AA implements IUsb2{

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
class BB implements IUsb<Integer,Float>{//实现接口时指定接口

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return IUsb.super.method(integer);
    }
}

class CC implements IUsb{//这样会指定泛型为默认值Object

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}