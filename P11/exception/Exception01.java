package src.P11.exception;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int res = num1/num2;//会抛出异常，下面的代码就不会继续执行
        System.out.println(res);

    }
}

