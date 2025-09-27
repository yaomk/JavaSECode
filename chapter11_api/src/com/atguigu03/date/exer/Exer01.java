package com.atguigu03.date.exer;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Exer01
 * Description:
 *
 * @Author yao
 * @Create 2025/9/22 12:01
 * @Version 1.0
 */
public class Exer01 {
    /*
    * 如何将一个 java.util.Date 的实例转化为 java.sql.Date 的实例
    * */
    @Test
    public void test1() {
        Date date1 = new Date();

        /*
        * 错误的
        * java.sql.Date date2 = (java.sql.Date) date1;
        * System.out.println(date2);
        */

        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }

    /*
    * 将控制台获取的年月日的字符串数据（如2025-09-22），保存在数据库中
    * */
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pattern = "2025-09-22";
        Date date1 = sdf.parse(pattern);
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
        
    }
}
