package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * ClassName: SubOrder
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午10:59
 * @Version 1.0
 */
public class SubOrder extends Order {

    public void method() {
        orderProtected = 1;
        orderPublic = 1;

        methodProtected();
        methodPublic();

        //不能访问
        //orderPrivate = 1;
        //orderDefault = 1;
        //methodPrivate();
        //methodDefault();
    }
}
