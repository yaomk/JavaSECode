package com.atguigu01.create.exer1;

/**
 * ClassName: PrintNumberTest
 * Description: 创建两个分线程，其中一个线程遍历100以内的偶数，另一个遍历100以内的奇数
 *
 * @Author yao
 * @Create 2024/10/7 12:03
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        // 方式1
        EvenNumberPrint t1 = new EvenNumberPrint();
        OddNumberPrint t2 = new OddNumberPrint();
        t1.start();
        t2.start();

        //方式2：匿名对象
        //new EvenNumberPrint().start();
        //new OddNumberPrint().start();

        //方式3：匿名子类的匿名对象
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " 偶数:->" + i);
                }
            }
        }).start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " 奇数:" + i);
                    }
                }
            }
        }.start();
    }
}

class EvenNumberPrint extends Thread { // 用于打印偶数
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " 偶数:->" + i);
            }
        }
    }
}

class OddNumberPrint extends Thread { // 用于打印奇数
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " 奇数:" + i);
            }
        }
    }
}