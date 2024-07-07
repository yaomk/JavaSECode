package com.atguigu04.override.test1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午10:56
 * @Version 1.0
 */
public class OrderTest {
    public void method1() {
        Order order = new Order();

        //通过对象调用Order类中声明的属性、方法
        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //受封装性的影响，不能调用
        //order.orderPrivate = 1;
        //order.methodPrivate();
    }
}
