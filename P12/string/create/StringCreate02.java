package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate02 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = "hsp";
        System.out.println(a==b);              //判断对象false（含有基本数据类型，判断的是值）
        System.out.println(a.equals(b));
        System.out.println(a==b.intern());
        System.out.println(b==b.intern());
    }
}
//当b=b.intern();执行后，首先会判断b的字符串是否在常量池；
// 如果有，则把"abc"的地址引用值反向指回b