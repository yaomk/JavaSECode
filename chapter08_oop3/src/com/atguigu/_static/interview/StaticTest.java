package com.atguigu._static.interview;

/**
 * ClassName: StaticTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/24 10:16
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Order o1 = null;
        o1.hello(); // hello
        System.out.println(o1.count); // 1

    }
}

class Order {
    public static int count = 1;

    public static void hello() {
        System.out.println("hello");
    }
}