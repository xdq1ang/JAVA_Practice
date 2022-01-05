package src.P12.string.stringbuffer;

/*
 *   @author : xdqiang
 */
public class StringBuffer_ {
    public static void main(String[] args) {
        /*
        *1.可以串行化
        *2.来自父类的byte[] value属性用于存放字符串内容（非常量存放于堆中）
        *3.StringBuffer是final类
        *
        * String   VS   StringBuffer
        * 1.String保存的是字符串常量，里面的值不能修改，每次String类的更新实际上是更改地址（效率低）private final char[] value
        * 2.StringBuffer保存的是字符串变量，里面的值可以更改，StringBuffer的更新实际上可以更新内容，不用每次更新地址（效率较高）char[] value。存放在堆中
        *
        *
        * */

        //默认创建大小为16的char[]用于存放字符串内容
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer(100);
        StringBuffer hello = new StringBuffer("hello");//16+"hello".length

        //String与StringBuffer之间相互转换
        //String转StringBuffer
        //方式一
        String str = "hello";
        StringBuffer stringBuffer2 = new StringBuffer(str);
        //方式二
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3 = stringBuffer3.append(str);
        //StringBuffer转String
        //方式一
        String s = stringBuffer3.toString();
        //方式二
        String s1 = new String(stringBuffer3);




    }
}
