package com.atguigu05.field.interview;

/**
 * ClassName: Test01
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 11:45
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        new HelloB();
        // static A -> static B -> I'm A Class -> HelloA -> I'm B Class -> HelloB
    }
}

class HelloA {
    static {
        System.out.println("static A");
    }

    {
        System.out.println("I'm A Class");
    }

    public HelloA() {
        System.out.println("HelloA");
    }
}

class HelloB extends HelloA {

    static {
        System.out.println("static B");
    }

    {
        System.out.println("I'm B Class");
    }

    public HelloB() {
        System.out.println("HelloB");
    }
}