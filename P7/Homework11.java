package P7;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println(Homework11.method(method(method(10.0,20.0),100)));

    }
    //参数
    // 2个double
    // 1个整数
    //返回值
    //
    public static double method(double...arr){
        double sum=0;
        for(double d:arr){
            sum+=d;
        }
        return sum;
    }
}
