package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/9/9 10:42
 * @Version 1.0
 */
public class WrapperTest1 {
    // 基本数据类型，包装类 -> String类型
    @Test
    public void test1() {
        // 方式一：调用 String 的重载静态方法 valueOf()
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);

        boolean b1 = true;
        Boolean bb1 = b1;
        String str2 = String.valueOf(b1);
        String str3 = String.valueOf(bb1);

        // 方式二：使用 + 连接运算
        String str4 = i1 + "";
        String str5 = b1 + "";
    }

    // String类型 -> 基本数据类型、包装类：调用包装类的静态方法：parseXxx()
    @Test
    public void test2() {
        String s1 = "12";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 10);

        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);

        //String s3 = "123a";
        //int i2 = Integer.parseInt(s3); // 报错：NumberFormatException
    }
}
