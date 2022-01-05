package src.P12.string.stringbuffer;

/*
 *   @author : xdqiang
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        /*
        *1.append()追加字符串
        *2.delete(n1,n2)删除索引n1到n2之间的字符
        *3.replace()替换
        *4.indexOf()返回第一次出现的索引
        *5.insert()在指定位置插入字符串
        *6.length()返回长度
        *
        * */
        StringBuffer sb = new StringBuffer("hello");
        sb.append(",");
        System.out.println(sb);
        sb.delete(2,5);
        System.out.println(sb);
        sb.replace(0, 1, "xdqiang is good");
        System.out.println(sb);
        System.out.println(sb.indexOf("xdqiang"));
        sb.insert(2,"CL");
        System.out.println(sb);

    }
}
