package com.atguigu07.encapsulation.exer4.test1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午11:23
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderDefault = 2;
        order.orderPublic = 3;
        //order.orderPrivate = 1;
        //调用方法
        order.methodDefault();
        order.methodPublic();
        //order.methodPrivate();
    }
}
