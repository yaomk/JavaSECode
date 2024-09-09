package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/9 10:09
 * @Version 1.0
 */
public class WrapperTest {
    /*
    基本数据类型 -> 包装类：① 使用包装类的构造器 ② 建议使用包装类的valueOf()
     */
    @Test
    public void test1() {
        int i1 = 10;
        Integer i1Int = new Integer(i1);
        System.out.println(i1Int.toString());

        float d1 = 12.3F;
        Float d1F = new Float(d1);
        System.out.println(d1F);

        String s1 = "12.4";
        //s1 = "abc";
        //System.out.println(new Float(s1)); // 报异常：NumberFormatException
        //s1 = "1234.33abc";
        //System.out.println(new Float(s1));// 报异常：NumberFormatException
        Float s1F = new Float(s1);
        System.out.println(s1F);

        String s2 = "false";
        s2 = "true";
        s2 = "FlAse";
        s2 = "TrUE"; // 忽略大小写的情况下 == "ture"，其他情况下都为 false
        Boolean s2B = new Boolean(s2);
        System.out.println(s2B);

        // 推荐使用：
        int i2 = 10;
        Integer i2Int = Integer.valueOf(i2);
        Boolean b2B = Boolean.valueOf("true");
        Float f2F = Float.valueOf(12.0F);
    }


    //包装类 -> 基本数据类型: 调用包装类的 xxxValue()
    @Test
    public void test2() {
        Integer int1 = Integer.valueOf(12);
        int i1 = int1.intValue();
        i1++;
        System.out.println(i1);

        Float ff1 = Float.valueOf("12.F");
        float f1 = ff1.floatValue();
        f1 += 0.1f;
        System.out.println(f1);

        Boolean bb2 = Boolean.valueOf("TRuE");
        boolean b2 = bb2.booleanValue();
        System.out.println(!b2);
    }

    @Test
    public void test3() {
        class Account {
            double balance;
            Double balance1;
        }
        Account account = new Account();
        System.out.println(account.balance); // 0.0
        System.out.println(account.balance1); // null
    }

    // jdk5.0 新特性：自动装箱、自动拆箱
    @Test
    public void test4() {
        //自动装箱
        int i1 = 10;
        Integer ii1 = i1;
        System.out.println(ii1.toString());

        Integer ii2 = ii1 + 1;
        System.out.println(ii2);

        Boolean bb1 = true;

        Float f1 = 12.3F;

        // 自动拆箱
        int i2 = ii1;
        boolean b1 = bb1;
    }
}
