package com.atguigu03.date.exer;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Exer02
 * Description:
 *
 * @Author yao
 * @Create 2025/9/27 19:16
 * @Version 1.0
 */
public class Exer02 {
    /*
    * 使用 Calendar 获取当前时间，把这个时间设置为你的生日，再获取你的百天（出生后100天）日期。
    * */
    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("你的生日为：" + date); // 你的生日为：Sat Sep 27 19:21:16 GMT+08:00 2025
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        Date newDate = calendar.getTime();
        System.out.println("百天为：" + newDate); // 百天为：Mon Jan 05 19:21:16 GMT+08:00 2026
    }

    /*
    * 使用 LocalDateTime 获取当前时间，把这个时间设置为你的生日，再获取你的百天（出生后100天）日期。
    * */
    @Test
    public void test2() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日为：" + localDateTime); // 你的生日为：2025-09-27T19:24:27.949
        LocalDateTime newLocalDateTime = localDateTime.plusDays(100);
        System.out.println("百天为：" + newLocalDateTime); // 百天为：2026-01-05T19:24:27.949
    }
}
