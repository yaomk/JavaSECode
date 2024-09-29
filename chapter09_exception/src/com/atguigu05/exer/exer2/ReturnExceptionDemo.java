package com.atguigu05.exer.exer2;

/**
 * ClassName: ReturnExceptionDemo
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 10:52
 * @Version 1.0
 */
public class ReturnExceptionDemo {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }

    static void methodA() throws Exception {
        try {
            System.out.println("methodA invoke");
            throw new Exception("有异常");
        } finally {
            System.out.println("methodA finally ");
        }
    }

    static void methodB() {
        try {
            System.out.println("methodB invoke");
            return;
        } finally {
            System.out.println("methodB finally");
        }
    }
}
