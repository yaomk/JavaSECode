package com.atguigu07.object.equals.exer1;

/**
 * ClassName: Order
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 12:57
 * @Version 1.0
 */
public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Order order) {
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}
