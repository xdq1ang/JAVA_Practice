package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate01 {
    public static void main(String[] args) {
        String a = "abc";//在常量池中创建"abc"字符串
        String b = "abc";//直接指向常量池中已有的"abc"字符串
        System.out.println(a.equals(b));//比较字符串的内容
        System.out.println(a==b);       //比较是否为同一对象

    }
}

/*
* String s1 = "hsp";
* String s2 = new String("hsp");
*
* 方式一：先从常量池看是否有“hsp”数据空间，如果有则直接指向，如果没有则重新（在字符串常量池）创建然后指向。s最终指向的是常量池的空间地址。
* 方式二：先在堆中创建空间，里面维护了value属性，指向字符串常量池的"hsp"空间。如果常量池没有"hsp"则重新创建，如果有则直接通过value指向。最终指向的是堆中的空间地址。
*
*
* */
