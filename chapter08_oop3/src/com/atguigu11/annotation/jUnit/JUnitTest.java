package com.atguigu11.annotation.jUnit;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JUnitTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/6 10:45
 * @Version 1.0
 */
public class JUnitTest { // 单元测试类
    int number = 30;

    public static void main(String[] args) {
        JUnitTest jUnitTest = new JUnitTest();
        jUnitTest.test1();
        jUnitTest.method("测试参数");
    }

    @Test
    public void test1() { // 单元测试方法
        System.out.println("hello");
    }

    @Test
    public void test2() {
        System.out.println("hello2");
        System.out.println("number = " + number);
        method("测试参数");
    }

    public void method(String n) {
        System.out.println("method。。。" + n);
    }

    @Test
    public void test3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数值：");
        int num = scan.nextInt();
        System.out.println(num);
    }
}
