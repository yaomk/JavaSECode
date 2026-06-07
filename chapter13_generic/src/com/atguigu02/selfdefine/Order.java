package com.atguigu02.selfdefine;

import java.util.ArrayList;

/**
 * ClassName: Order
 * Description:
 *
 * @Author yao
 * @Create 2026/6/7 10:09
 * @Version 1.0
 */
public class Order<T> {

    /// 声明了类的泛型参数后，就可以在类的内部使用此泛型参数。

    private T t;
    private int orderId;

    public Order() {
    }

    public Order(T t, int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // 自定泛型方法
    public T testMethod(T t) { // 不是泛型方法
        return t;
    }

    public <E> E genericMethod(E e) { // 是泛型方法
        return e;
    }

    public <E> ArrayList<E> copyFromArrayToList(E[] arr) { // 是泛型方法
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
