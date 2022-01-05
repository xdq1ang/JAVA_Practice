package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class String01 {
    public static void main(String[] args) {

        // String类常用构造方法：
        // String s1 = new String();
        // String s2 = new String(String original);
        // String s3 = new String(char[] a);
        // String s4 = new String(char[] a,int startIndex,int count)

        String name = "jack";//"jack"是字符串常量

        //String类是final类型，不可以被继承，
        // 不能被修改（value不能指向新对象，单个字符的内容是可以修改的）
        final char[] value = {'a','b','c'};
        value[0]='1';

        final char[] value2 = {'t','o'};
        //value=value2;   //会报错  Cannot assign a value to final variable 'value'

    }
}
