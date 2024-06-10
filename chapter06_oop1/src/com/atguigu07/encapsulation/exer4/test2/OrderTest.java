package com.atguigu07.encapsulation.exer4.test2;

import com.atguigu07.encapsulation.exer4.test1.Order;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午11:29
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        order.orderPublic = 3;
        order.methodPublic();

        //不能调用
        //order.orderPrivate = 1;
        //order.orderDefault = 2;

        //order.methodPrivate();
        //order.methodDefault();
    }
}
