package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringMethodTest1
 * Description:
 *
 * @Author yao
 * @Create 2025/1/19 12:18
 * @Version 1.0
 */
public class StringMethodTest1 {
    @Test
    public void test1() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");
        //判断字符串的长度是否为0
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());

        String s4 = null;
        //System.out.println(s4.isEmpty()); // 空指针异常 NullPointerException

        String s5 = "hello";
        //返回字符串的长度
        System.out.println(s5.length()); // 5

        // 将指定的字符串连接到此字符串的末尾，不改变原字符串
        System.out.println(s5.concat(" world")); // hello world
        System.out.println(s5);
    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "Hello";
        // 比较字符串是否相等，区分大小写
        System.out.println(s1.equals(s2)); // false
        // 比较字符串是否相等，不区分大小写
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        String s3 = "abcd"; // 97 98 99 100
        String s4 = "adef"; // 97 100 101 102
        // 按字典顺序比较两个字符串。比较基于字符串中每个字符的 Unicode 值。区分大小写
        System.out.println(s3.compareTo(s4)); // -2

        String s5 = "abcd";
        String s6 = "aBcd"; // 97 66 99 100
        // 区分大小写
        System.out.println(s5.compareTo(s6)); // 32
        // 不区分大小写的比较
        System.out.println(s5.compareToIgnoreCase(s6)); // 0

        String s7 = "张a";
        String s8 = "李a";
        System.out.println(s7.compareTo(s8));

        String s9 = "  he llo   ";
        // 去除字符串前后的空白字符
        System.out.println("*" + s9.trim() + "*"); // *he llo*

        String s10 = "hello";
        String s11 = new String("hello");
        // String intern() 返回在字符串常量池中的字符串
        System.out.println(s10.intern() == s11.intern());
    }

    @Test
    public void test3() {
        String s1 = "hello world";
        // 字符串是否包含指定的字符序列
        System.out.println(s1.contains("wor")); // true
        System.out.println(s1.indexOf("ll")); // 2
        System.out.println(s1.indexOf("l", 4)); // 9
        System.out.println(s1.lastIndexOf("l")); // 9
        System.out.println(s1.lastIndexOf("l", 4)); // 3
    }

    @Test
    public void test4() {
        String str = "hello world";
        System.out.println(str.substring(6)); // world
        System.out.println(str.substring(2, 9)); // llo wor
    }

    @Test
    public void test5() {
        String str = "hello world";
        System.out.println(str.charAt(4)); // o

        String s1 = String.valueOf(new char[]{'a', 'b', 'c'});
        String s2 = String.copyValueOf(new char[]{'a', 'b', 'c'});
        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test6() {
        String s1 = "hello";

        String s2 = s1.replace('l', 'w');
        System.out.println(s1);
        System.out.println(s2); // hewwo

        String s3 = s1.replace("ll", "www");
        System.out.println(s3); // hewwwo

        String s4 = s1.replaceAll("[hl]", "w");
        System.out.println(s4); // wewwo

        String s5 = s1.replaceFirst("[l]", "w");
        System.out.println(s5); // hewlo

    }
}
