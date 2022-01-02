package src.P10.enumeration;

import java.util.Arrays;

public class EnumMethod {
    public static void main(String[] args) {
        Season2 summer = Season2.SUMMER;
        //输出枚举对象的名称
        System.out.println(summer.name());
        //输出该枚举对象的次序（0开始）
        System.out.println(summer.ordinal());
        //返回枚举对象数组
        System.out.println(Arrays.toString(Season2.values()));
        //通过字符串返回枚举对象
        System.out.println(Season2.valueOf("SUMMER"));
        //两个枚举对象的编号进行比较（编号相减）
        System.out.println(Season2.SUMMER.compareTo(Season2.WINTER));
    }
}

enum Season2{
    SUMMER("夏天","温暖"),WINTER("冬天","寒冷");

    private String name;
    private String desc;

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}

