package com.atguigu01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Description:
 *
 * @Author yao
 * @Create 2025/1/19 11:28
 * @Version 1.0
 */
public class StringMethodTest {
    public static void main(String[] args) {
        System.out.println("string");
    }

    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("hello world");
        String s3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s3);
    }

    /*
    String 与常见的其他结构之间的转换
    1. String 与基本数据类型、包装类之间的转换
    2. String 与 char[] 数组之间的转换
    3. String 与 byte[] 数组之间的转换
     */
    @Test
    public void test2() {
        int num = 10;
        //基本数据类型 --> String
        //方式1：
        String s1 = num + "";
        // 方式2：
        String s2 = String.valueOf(num);

        // String --> 基本数据类型：调用包装类的 parseXxx(String xxx)
        String s3 = "123";
        int i3 = Integer.parseInt(s3);
    }

    /*
    String 与 char[] 之间的转换
     */
    @Test
    public void test3() {
        String str = "hello";
        // String --> char[]：调用String的toCharArray()
        char[] arr = str.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
        // char[] --> String：调用 String 的构造器
        String s1 = new String(arr);
        System.out.println(s1);
    }

    /*
    String 与 byte[] 之间的转换
    * 在 utf-8 字符集中，一个汉字占用 3 个字节，一个字母占用 1 个字节。
    * 在 gbk 字符集中，一个汉字占用了 2 个字节，一个字母占用 1 个字节。

    * utf-8 和 gbk 字符集都向下兼容了 ASCII 码。

    编码与解码：
    * 编码（encode）：String --> 字节或字节数组
    * 解码（decode）：字节或字节数组 --> String
    要求：解码时使用的字符集必须与编码时使用的字符集一致
     */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc中国");

        // String --> byte[]: 调用 String 的 getBytes()
        byte[] arr = str.getBytes(); // 使用了默认的字符集
        for (byte b : arr) {
            System.out.println(b);
        }
        System.out.println();
        // 使用指定的字符集: getBytes(String charsetName)。
        byte[] arr1 = str.getBytes("GBK");
        for (byte b : arr1) {
            System.out.println(b);
        }

        // byte[] --> String
        String str1 = new String(arr); // 使用默认的字符集（utf-8）
        System.out.println(str1);

        String str2 = new String(arr, "utf-8"); // 显式的指明解码的字符集：utf-8
        System.out.println(str2);
        System.out.println(new String(arr1, "gbk"));

        String str3 = new String(arr, "gbk"); // 显式的指明解码的字符集：gbk
        System.out.println(str3); // 会导致乱码

        String str4 = new String(arr1, "utf-8");
        System.out.println(str4); // 会导致乱码
    }

    @Test
    public void test5() {
        int i = 0;
        i = i + 1;
        System.out.println("string" + i);
    }
}
