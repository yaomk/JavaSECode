package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午11:05
 * @Version 1.0
 */
public class OrderTest {
    public void method() {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();

        //不能访问
        //order.orderPrivate = 1;
        //order.orderDefault = 1;
        //order.orderProtected = 1;
        //order.methodPrivate();
        //order.methodDefault();
        //order.methodProtected();
    }
}
