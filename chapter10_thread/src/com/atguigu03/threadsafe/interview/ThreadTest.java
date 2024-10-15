package com.atguigu03.threadsafe.interview;

/**
 * ClassName: ThreadTest
 * Description:
 * 关于 Thread.sleep() 方法的一个面试题：如下的代码中 sleep()执行后，到底是哪个线程进入了阻塞状态。
 *
 * @Author yao
 * @Create 2024/10/15 12:02
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyTread t = new MyTread("线程1");
        t.start();
        // 调用 sleep 方法
        try {
            t.sleep(1000 * 5); // 相当于 Thread.sleep()
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 5s 之后这里才会执行。
        System.out.println("hello world!");
    }
}

class MyTread extends Thread {
    public MyTread() {
    }

    public MyTread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}