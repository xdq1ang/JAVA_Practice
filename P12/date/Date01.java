package src.P12.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   @author : xdqiang
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        //构造器1：获取当前时间
        Date date = new Date();
        System.out.println(date);
        //日期的格式是规定好的，不能乱写
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //构造器2：通过毫秒数获取指定时间
        Date date1 = new Date(50000);
        System.out.println(simpleDateFormat.format(date1));
        //可以把格式化的字符串转成对应的Date
        //Fri Jan 07 03:41:55 CST 2022
        System.out.println(simpleDateFormat.parse("2022年01月07日 03:41:55 周五"));

    }
}
