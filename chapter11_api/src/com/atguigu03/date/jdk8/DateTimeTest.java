package com.atguigu03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Description:
 *
 * @Author yao
 * @Create 2025/9/27 10:30
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    * Calendar 存在的问题：
    * 1. 可变性：像日期和时间这样的类应该是不可变的
    * 2. 偏移性：Date中的年份是从1900年开始的，而月份都从0开始
    * 3. 格式化：格式化只对Date有用，Calendar则不行
    * 4. 此外，他们也不是线程安全的，不能处理闰秒等
    * */

    @Test
    public void test1() {
        String s1 = "hello world";
        String s2 = s1.replace("world", "hello"); // String的不可变性
        System.out.println(s1);
        System.out.println(s2);

        // 体会 Calendar 的可变性
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1); // 设置为当月的第一天
        System.out.println(calendar.getTime());
    }

    @Test
    public void test2() {
        // 偏移性：Date中的年份是从1900年开始的，而月份都从0开始
        Date date = new Date(2025 - 1900,11,1);
        System.out.println(date); // Mon Dec 01 00:00:00 GMT+08:00 2025
    }
    /*
    * JDK8中的Api：LocalDate，LocalTime，LocalDateTime
    * */
    @Test
    public void test3() {
        // LocalXxx.now()：获取当前日期和时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate); // 2025-09-27
        System.out.println(localTime); // 10:52:44.297
        System.out.println(localDateTime); // 2025-09-27T10:52:44.297

        // LocalXxx.of(): 获取指定的日期、时间对应的实例
        LocalDate localDate1 = LocalDate.of(2025, 10, 1);
        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 10, 1, 12, 30, 59);

        System.out.println(localDate1); // 2025-10-01
        System.out.println(localDateTime1); // 2025-10-01T12:30:59

        System.out.println();

        LocalDateTime localDateTime2 = LocalDateTime.now();
        // getDayOfMonth(): 获取月份的日期
        System.out.println(localDateTime2.getDayOfMonth()); // 27
        // 体现不可变性
        // withDayOfMonth(): 返回一个新的，更改过月份日期的时间
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(15);
        System.out.println(localDateTime3); // 2025-09-15T11:03:18.331
        System.out.println(localDateTime2); // 2025-09-27T11:03:18.331

        System.out.println();
        // plusDays(long days) 返回一个新的，添加过指定天数的日期
        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System.out.println(localDateTime2); // 2025-09-27T11:03:18.331
        System.out.println(localDateTime4); // 2025-10-02T11:03:18.331
    }

    @Test
    public void test4() {
        // Instant.now() 返回一个系统时间的UTC时区的 Instant 类的对象
        Instant instant = Instant.now();
        System.out.println(instant); // 2025-09-27T10:30:34.521Z

        // instant.atOffset(ZoneOffset offset) 结合即时的偏移来创建一个 OffsetDateTime
        OffsetDateTime instant1 = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(instant1); // 2025-09-27T18:30:34.521+08:00

        // Instant.ofEpochMilli(long epochMilli) 返回加上指定毫秒数之后的 Instant 类的对象
        Instant instant2 = Instant.ofEpochMilli(24125461321L);
        System.out.println(instant2); // 1970-10-07T05:31:01.321Z

        // instant.toEpochMilli() 返回时间戳
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli); // 1758969316238
        System.out.println(new Date().getTime()); // 1758969316278
    }
    
    @Test
    public void test5() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化：日期、时间 -> 字符串
        String strDateTime = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(strDateTime); // 2025-09-27 18:53:02

        System.out.println();

        // 解析：字符串 -> 日期、时间
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse("2026-10-01 18:05:10");
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime); // 2026-10-01T18:05:10
    }
}
