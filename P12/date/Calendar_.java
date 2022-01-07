package src.P12.date;

import java.util.Calendar;

/*
 *   @author : xdqiang
 */
public class Calendar_ {
    public static void main(String[] args) {
        /*
        * Calendar
        * 1. 是一个抽象类，构造器是私有的
        * 2. 可以通过getInstance()来获取
        *
        * */
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.YEAR));
        //月是按照0开始。需要加一
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        //24小时制时间
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));


        /*
        * 缺点：
        * 1. 可变性：日期类应该是不可变的
        * 2. 偏移性：Date中年份都是1900开始，月都是0开始
        * 3. 格式化：格式化只对Date有用，Calendar则不行
        * 4. 此外它们也不是线程安全的，不能处理闰秒等（每隔两天，多出1秒）
        *
        *
        * */




    }
}
