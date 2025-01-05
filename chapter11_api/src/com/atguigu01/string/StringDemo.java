package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringDemo
 * Description:
 *
 * @Author yao
 * @Create 2025/1/5 10:52
 * @Version 1.0
 */
public class StringDemo {
    @Test
    public void test1() {
        String s1 = "hello"; // 字面量的定义方式
        String s2 = "hello";
        System.out.println(s1 == s2); // true
    }

    /*
     * String 的不可变性
     * ①当对字符串变量重新赋值时，需要重新指定一个字符串常量的位置进行赋值，不能在原有的位置修改。
     * ②当对现有的字符串进行拼接操作时，需要重新开辟空间保存拼接以后的字符串，不能在原有的位置修改
     * ③当调用字符串的 replace() 替换现有的某个字符串时，需要重新开辟空间保存修改以后的字符串，不能在原有的位置修改
     */
    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "hello";

        s2 = "hi";
        System.out.println(s1); // hello
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "hello";
        s2 += " world";
        System.out.println(s1); // hello
        System.out.println(s2); // hello world
    }

    @Test
    public void test4() {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace('l', 'r');
        System.out.println(s1); // hello
        System.out.println(s2); // hello
        System.out.println(s3); // herro
    }
}
