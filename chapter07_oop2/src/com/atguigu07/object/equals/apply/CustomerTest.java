package com.atguigu07.object.equals.apply;

/**
 * ClassName: CustomerTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 12:46
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 12, new Account(3000));
        Customer c2 = new Customer("Tom", 12, new Account(3000));
        System.out.println(c1.equals(c2));
    }
}
