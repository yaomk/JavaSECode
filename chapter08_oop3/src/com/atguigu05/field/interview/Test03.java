package com.atguigu05.field.interview;

/**
 * ClassName: Test03
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 11:52
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Sub s = new Sub();
        // base -> sub: 100 -> sub -> base: 70
    }
}

class Base {
    {
        System.out.println("base");
    }

    Base() {
        method(100);
    }

    public void method(int i) {
        System.out.println("base: " + i);
    }
}

class Sub extends Base {
    {
        System.out.println("sub");
    }

    Sub() {
        super.method(70);
    }

    public void method(int i) {
        System.out.println("sub: " + i);
    }
}
