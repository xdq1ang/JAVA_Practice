package P3;

public class Homework03 {
    public static void main(String[] args) {
        /*
        *
        * 判断正误
        *
        * */
        //int num1 = (int)"18";无法把字符串转化为int，要使用包装类才可以把字符串转化为数值
        int num1 = Integer.parseInt("12");
        //int num2=18.0;类型不匹配
        double num3 = 3d;
        double num4 = 8;//会发生自动类型转换
        //int i =48;char ch = i+1;类型不匹配
        //byte b = 19;short s = b+2;   b+2之后已经变成int类型，int类型不能转为short
    }
}
