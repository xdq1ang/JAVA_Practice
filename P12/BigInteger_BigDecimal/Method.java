package src.P12.BigInteger_BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 *   @author : xdqiang
 */
public class Method {
    public static void main(String[] args) {
        // 1. 存储大整数
        //数据太大溢出，基本数据类型无法存储
        //long l = 999999999999999999999999999999999999999l;
        BigInteger bigInteger = new BigInteger("999999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("111");
        System.out.println(bigInteger);
        //对BigInteger进行运算需要使用对应的方法。
        System.out.println(bigInteger.add(bigInteger1));

        // 2. 存储高精度浮点数,会精度损失
        double d = 520.0000000000000000000000000004564004654d;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("520.0000000000000000000000000004564004654");
        BigDecimal bigDecimal1 = new BigDecimal("3.1");
        System.out.println(bigDecimal);
        //对BigDecimal进行运算需要使用对应的方法。
        //在进行除法运算时，如果结果为无限小数则会抛出异常。
        // BigDecimal.ROUND_CEILING参数会把结果保留到分子的精度
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));



    }
}
