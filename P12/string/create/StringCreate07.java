package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate07 {
    public static void main(String[] args) {
        /*
        * 字符串常量拼接：编译器自动优化拼接，然后直接在池中直接创建拼接后的字符串常量
        * 字符串变量拼接：用append()拼接，在堆中创建字符串对象，在池中创建拼接后的字符串。然后让value[]指向池中的字符串
        *
        * */

        String s1 = "xdqiang";    //在池中创建
        String s2 = "java";   //在池中创建
        String s5 = "xdqiangjava";//在池中创建
        String s6 = (s1+s2).intern();//先在堆中创建对象然后指向堆中的"xdqiangjava",然后指向池中的"xdqiangjava"
        System.out.println(s5==s6);  //true
        System.out.println(s5.equals(s6));//true
    }
}
