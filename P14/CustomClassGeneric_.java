package src.P14;

/*
 *   @author : xdqiang
 */
public class CustomClassGeneric_ {
    public static void main(String[] args) {


    }
}
class Tiger<T,R,M>{//Tiger为自定义泛型类，泛型的标识符一般为大写
    String name;
    R r;           //属性可以使用泛型
    M m;
    T t;
    T[] ts;
    //T[] ts = new T[8];  不能使用泛型对数组进行初始化，因为还不知道数据具体类型，所以不知道开辟多大空间

    //public static void m1(R r){}  静态方法不能使用泛型，因为静态方法是与类相关的，类加载时对象还未创建，没创建对象时泛型还未确定具体类型
    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public R getR() {       //方法可以使用泛型
        return r;
    }

    public M getM() {
        return m;
    }

    public T getT() {
        return t;
    }
}