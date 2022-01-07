package src.P12.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 *   @author : xdqiang
 */
public class LocalDate_LocalTime_localDateTime {
    public static void main(String[] args) {
        /*
         * Calendar缺点：
         * 1. 可变性：日期类应该是不可变的
         * 2. 偏移性：Date中年份都是1900开始，月都是0开始
         * 3. 格式化：格式化只对Date有用，Calendar则不行
         * 4. 此外它们也不是线程安全的，不能处理闰秒等（每隔两天，多出1秒）
         *
         *
         * */

        /*
        * LocalDate：只有日期
        * LocalTime：只有时间
        * LocalDateTime：日期+时间
        *
        *
        * */

        //返回当前日期
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //返回指定日期
        System.out.println(ldt.getDayOfMonth());

        //格式日期类
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss E");
        System.out.println(dtf.format(ldt));

        //时间戳，类似和Date，提供了Date.from()转化为Date对象
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        System.out.println(date);
        Instant now1 = date.toInstant();
        System.out.println(now1);

        //时间相加减计算plus,minus
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = ldt.plusDays(890);//加上890天后的时间
        System.out.println(dtf.format(ldt2));
        LocalDateTime ltd3 = ldt.minusMinutes(35);
        System.out.println(dtf.format(ltd3));

    }
}
