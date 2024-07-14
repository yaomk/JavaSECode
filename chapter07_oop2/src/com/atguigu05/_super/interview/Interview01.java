package com.atguigu05._super.interview;

/**
 * ClassName: Interview01
 * Description:
 *
 * @Author yao
 * @Create 2024/7/14 上午11:44
 * @Version 1.0
 */
public class Interview01 {
    public static void main(String[] args) {
        new A(new B()); // A B A AB
    }
}

class A {
    public A() {
        System.out.println("A");
    }
    public A(B b) {
        this();
        System.out.println("AB");
    }
}

//class B {
//    public B() {
//        System.out.println("B");
//    }
//}

class B extends A {
    public B() {
        //super(); 省略的话相当于调用了 super();
        System.out.println("B");
    }
}