package src.P12.string.method;

import java.util.Arrays;
import java.util.Locale;

/*
 *   @author : xdqiang
 */
public class StringMethod {
    public static void main(String[] args) {
        /*
        * 1.equals()
        * 2.equalsIgnoreCase()不区分大小写
        * 3.length()
        * 4.indexOf()返回字符串第一次出现的位置
        * 5.lastIndexOf()返回字符串最后一次出现的索引
        * 6.substring()截取子串
        * 7.toUppercase()
        * 8.toLowercase()
        * 9.concat()
        * 10.replace()
        * 11.split()
        * 12.toCharArray()
        * 13.compareTo()  前者大返回正数
        * 14.format()
        *
        * */

        String s = "abc,def,g,HIJK";
        System.out.println(s.substring(0,5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.concat(" xdqiang"));
        System.out.println(s.replace("HIJK"," xdqiang"));
        System.out.println(Arrays.toString(s.split(",")));
        System.out.println(String.format("name: %s  age: %d", "xdqiang",22));
    }
}
