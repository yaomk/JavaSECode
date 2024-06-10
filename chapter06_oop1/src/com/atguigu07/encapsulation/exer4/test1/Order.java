package com.atguigu07.encapsulation.exer4.test1;

/**
 * ClassName: Order
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午11:20
 * @Version 1.0
 */
public class Order {
    //声明不同的权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    //声明不同权限的方法
    private void methodPrivate() {
        System.out.println(orderPrivate);
    }
    void methodDefault() {
        System.out.println(orderDefault);
    }
    public void methodPublic() {
        System.out.println(orderPublic);
    }

    public void test() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPrivate = 3;
        methodPrivate();
        methodDefault();
        methodPublic();
    }
}
