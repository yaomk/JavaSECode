package com.atguigu04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: LockTest
 * Description:
 *
 * @Author yao
 * @Create 2024/10/15 18:35
 * @Version 1.0
 */
public class LockTest {
    public static void main(String[] args) {
        Window w1 = new Window("窗口1");
        Window w2 = new Window("窗口2");
        Window w3 = new Window("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread {
    //1. 创建 Lock 的实例，需要确保多个线程共用同一个 Lock 实例！需要考虑将此对象声明为 static finally
    private static final ReentrantLock lock = new ReentrantLock();
    static int ticket = 100;

    public Window() {
    }

    public Window(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                //2. 执行 lock 方法，锁定对共享资源的调用
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票号：" + ticket--);
                } else {
                    break;
                }

            } finally {
                //3. unlock() 的调用，释放对共享资源的调用。
                lock.unlock();
            }
        }
    }
}
