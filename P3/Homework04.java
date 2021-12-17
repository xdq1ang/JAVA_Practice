package P3;

public class Homework04 {
    public static void main(String[] args) {
        String s = "5";
        double d=Double.parseDouble(s);//字符串转数值必须使用包装类
        System.out.println(d);
        char c = 'f';
        String s2 = c + "";//char转换为字符串
        System.out.println(s2);
        System.out.println(7>5?true:false);

    }
}
/*
* 标识符命名规则：
* 数字，字母，下划线，$组成
* 不能以数字开头，不能含有空格
*
* 标识符命名规范：
* 包名：所有字母小写
* 类名，接口名：单词首字母大写
* 变量，方法名：驼峰命名法
* 常量名：所有字母大写
*
* 进制：
* 二 进 制：0B或0b开头
* 八 进 制：以0开头
* 十六进制：以0x或0X开头。A-F不区分大小写
*
*
* */
