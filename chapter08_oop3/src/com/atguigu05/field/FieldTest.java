package com.atguigu05.field;

/**
 * ClassName: FieldTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 11:08
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);
    }
}

class Order {
    int orderId = 1;

    {
        orderId = 2;
    }

    public Order() {
        super();
        //orderId = 3;
    }
}
