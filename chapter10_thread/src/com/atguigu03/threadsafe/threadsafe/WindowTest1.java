package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Description:
 * 使用继承 Thread 方式，卖票
 *
 * @Author yao
 * @Create 2024/10/15 10:39
 * @Version 1.0
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1("窗口1");
        Window1 w2 = new Window1("窗口2");
        Window1 w3 = new Window1("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window1 extends Thread {
    static int ticket = 10;
    static boolean isFlag = true;

    public Window1() {
    }

    public Window1(String name) {
        super(name);
    }

    //public synchronized void show() { // 此时同步监视器：this，即上边w1,w2,w3，线程是不安全的。
    public static synchronized void show() { // 此时同步监视器：当前类本身，即为 Window1.class，是唯一的。
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号：" + ticket--);
        } else {
            isFlag = false;
        }
    }

    @Override
    public void run() {
        while (isFlag) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            show();
        }
    }
}
