package com.atguigu13.idea.debug;

interface Customer {
    void accept(String str);
}

/**
 * ClassName: Debug02Test
 * Description:
 *
 * @Author yao
 * @Create 2024/9/12 11:57
 * @Version 1.0
 */
public class Debug02Test {
    public static void main(String[] args) {

        //Son instance = new Son();
        //instance.test();

        // 类的多态性
        Father father = new Son();
        father.test();

        // 接口的多态性
        Customer cus = new CustomerImp();
        cus.accept("cs");
    }
}

class Father {
    // 方法断点
    public void test() {
        System.out.println("Father test()");
    }
}

class Son extends Father {
    @Override
    public void test() {
        System.out.println("Son override test()");
    }
}

class CustomerImp implements Customer {
    @Override
    public void accept(String str) {
        System.out.println("CustomerImp accept(): " + str);
    }
}