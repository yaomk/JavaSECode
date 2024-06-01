package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 下午4:58
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1.基本数据类型的局部变量
        int m = 10;
        int n = m;
        System.out.println("m = " + m + ", n = " + n);
        m++;
        System.out.println("m = " + m + ", n = " + n);
        //2.引用数据类型的局部变量
        //2.1数组类型
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println("arr1[0] = " + arr1[0]);

        //2.2对象类型
        Order order1 = new Order();
        order1.orderId = 1024;

        Order order2 = order1;
        order2.orderId = 2048;
        System.out.println("order1.orderId = " + order1.orderId);
    }
}

class Order {
    int orderId;
}