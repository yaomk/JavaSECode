package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 13:00
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1001, "orderA");
        Order o2 = new Order(1001, "orderA");
        System.out.println(o1.equals(o2));

        Order o3 = new Order(1001, new String("orderA"));
        Order o4 = new Order(1001, new String("orderA"));
        System.out.println(o3.equals(o4));

        //取的是字符串常量池中的同一个
        String s1 = "str";
        String s2 = "str";
        System.out.println(s1 == s2); // true
    }
}
