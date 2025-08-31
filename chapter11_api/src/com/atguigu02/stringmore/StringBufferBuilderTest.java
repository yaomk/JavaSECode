package com.atguigu02.stringmore;

import org.junit.Test;

/**
 * ClassName: StringBufferBuilderTest
 * Description:
 *
 * @Author yao
 * @Create 2025/8/31 10:59
 * @Version 1.0
 */
public class StringBufferBuilderTest {
    /*
      1.StringBuffer append(xx):提供了很多 append() 方法，用于字符串追加的方式拼接
      2.StringBuffer delete(int start, int end):删除 [Start, end) 之间的字符
      3.StringBuffer deleteCharAt(int index):删除 index 位置的字符
      4.StringBuffer replace(int start, int end, String str): 替换 [start, end) 范围内的字符串
      5.void setCharAt(int index, char c):替换 index 位置字符
      6.char charAt(int index): 查找指定 index 位置上的字符
      7.StringBuffer insert(int index, xx): 在 index 位置插入xx
      8.int length(): 返回存储的字符数据的长度
      9.StringBuffer reverse(): 反转
     */
    @Test
    public void test1() {
        StringBuilder strB1 = new StringBuilder();
        strB1.append("hello").append(" ").append("world").append("!");
        System.out.println(strB1);
    }

    @Test
    public void test2() {
        StringBuilder strB2 = new StringBuilder("hello");
        System.out.println(strB2.length()); // 5 实际存储的字符的个数
        strB2.insert(5, " world").append("!");
        strB2.insert(0, "wow ");
        System.out.println(strB2);

        StringBuilder strB3 = strB2.reverse();
        System.out.println(strB2);
        System.out.println(strB3);

        System.out.println(strB3 == strB2); // true
    }

    @Test
    public void test3() {
        StringBuilder strB3 = new StringBuilder("hello");
        strB3.setLength(2);
        System.out.println(strB3);
        strB3.append("world");
        System.out.println(strB3);
        strB3.setLength(10);
        System.out.println(strB3.charAt(9) == 0); // true
    }

    /**
     * 测试 String，StringBuffer，StringBuilder 在操作数据方面的效率
     */
    @Test
    public void test4() {
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            text += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 执行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 执行时间：" + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 执行时间：" + (endTime - startTime) + "ms");
    }
}
