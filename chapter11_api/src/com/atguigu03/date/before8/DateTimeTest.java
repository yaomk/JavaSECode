package com.atguigu03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Description:
 *
 * @Author yao
 * @Create 2025/9/22 10:59
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    * Date 类的使用
    * |--java.util.Date
    *   两个构造器的使用
    *   两个方法的使用：① toString(), ② getTime()
    *       |----java.sql.Date: 对应着数据库中的date的类型
    * */
    @Test
    public void test1() {
        Date date1 = new Date(); // 创建一个基于当前系统时间的 Date 的实例
        System.out.println(date1.toString());

        long millimetres = date1.getTime();
        System.out.println("对应的毫秒数为：" + millimetres); // 1758510366978

        Date date2 = new Date(1858510366978L);
        System.out.println(date2);
    }
    @Test
    public void test2() {
        java.sql.Date date1 = new java.sql.Date(1758510366978L);
        System.out.println(date1); // 2025-09-22

        System.out.println(date1.getTime()); // 1758510366978
    }

    /*
    * SimpleDateFormat 类：用于日期时间的格式化和解析
    * 格式化：日期 -> 字符串
    * 解析：字符串：-> 日期
    * */
    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date1 = new Date();
        // 格式化：日期 -> 字符串
        String strDate = sdf.format(date1);
        System.out.println(strDate);

        // 解析：字符串：-> 日期
        Date date2 = sdf.parse("25-9-22 上午11:20");
        System.out.println(date2);
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);
        Date date2 = sdf.parse("2025-09-22 11:26:00");
        System.out.println(date2);

        /*
         解析失败，因为参数的字符串不满足 SimpleDateFormat 可以识别的格式
         Date date3 = sdf.parse("22-12-5 下午2:22");
         System.out.println(date3);
        */
    }

    /*
    * Calendar: 日历类
    *
    * ① 由于 Calendar 是一个抽象类，所以我们需要创建其子类的实例。这里我们通过 Calendar 的静态方法 getInstance() 即可获取
    * ② 常用方法：get(int field) / set(int filed, xx) / add(int field, xx) / getTime() / setTime()
    * */
    @Test
    public void test5() {
        Calendar cIns = Calendar.getInstance();
        System.out.println(cIns.getClass());

        // get(int filed)
        System.out.println(cIns.get(Calendar.DAY_OF_WEEK));
        System.out.println(cIns.get(Calendar.DAY_OF_MONTH));
        System.out.println(cIns.get(Calendar.DAY_OF_YEAR));

        // set(int filed, x)
        cIns.set(Calendar.DAY_OF_WEEK, 1);
        System.out.println(cIns.get(Calendar.DAY_OF_WEEK));

        // add(int filed, xx)
        cIns.add(Calendar.DAY_OF_WEEK, 2);
        System.out.println(cIns.get(Calendar.DAY_OF_WEEK));

        // getTime(): Calendar -> Date
        Date date = cIns.getTime();
        System.out.println(date);

        // setTime(): 使用指定的 Date 重置 Calendar
        cIns.setTime(new Date(1758510366978L));
        System.out.println(cIns.getTime());
    }
}
