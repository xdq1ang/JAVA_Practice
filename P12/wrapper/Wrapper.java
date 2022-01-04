package src.P12.wrapper;

/*
 *   @author : xdqiang
 */
public class Wrapper {
    public static void main(String[] args) {
        //int  -->   Integer
        //jdk5以前手动装箱拆箱
        int n1 =100 ;
        //Integer integer = new Integer(n1);
        Integer integer = Integer.valueOf(n1);
        //手动拆箱
        int i = integer.intValue();

        //jdk5以后自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱（底层使用的是Integer.valueOf(n2)）
        Integer integer2 = n2;
        //自动拆箱(底层使用的是intValue())
        int n3 = integer2;

        //返回最大值，最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}


//三元运算符是一个整体（取最高精度）
