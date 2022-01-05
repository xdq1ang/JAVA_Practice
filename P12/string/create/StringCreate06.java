package src.P12.string.create;

/*
 *   @author : xdqiang
 */
public class StringCreate06 {
    public static void main(String[] args) {
        String a = "hello" + "abc";//编译器会直接把字符串拼接起来，在常量池创建了"helloabc"

        String b = "xdqiang";//在池创建"xdqiang"
        String c = "fff";    //在池创建"fff"
        String d = b+c;      //在堆中创建对象(d指向整个堆中的对象)，其value[]指向池中的"xdqiangfff"。
        /*
        * 1. 创建一个StringBuilder sb = StringBuilder()
        * 2. 执行sb.append("xdqiang")
        * 3. 执行sb.append("fff")
        * 4. 执行String s = sb.toString()在池中(使用new)创建"xdqiangfff"
        *
        * String常量相加：指向池
        * String变量相加：指向堆（堆指向池）
        * */
    }
}
