package src.P12.math;

/*
 *   @author : xdqiang
 */
public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.abs(-9));
        System.out.println(Math.pow(2,6));  //求幂
        System.out.println(Math.ceil(2.3)); //向上取整
        System.out.println(Math.floor(2.3));//向下取整
        System.out.println(Math.round(2.3));//四舍五入
        System.out.println(Math.sqrt(4));   // 开方
        System.out.println(Math.random());  //返回[0,1)的随机数
        System.out.println(Math.min(10,20));
        System.out.println(Math.max(10,20));
        //输出a到b之间的随机整数
        int a = 2;
        int b = 50;
        double rand01 = Math.floor((b-a+1)*Math.random());
        double num = a+rand01;
        System.out.println(rand01);
        System.out.println(num);

    }
}
