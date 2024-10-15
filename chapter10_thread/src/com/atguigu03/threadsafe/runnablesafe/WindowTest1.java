package com.atguigu03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Description:
 * 使用实现 Runnable 接口的方式，实现卖票
 * 使用同步代码块解决上述卖票中的线程安全问题。
 *
 * @Author yao
 * @Create 2024/10/15 10:31
 * @Version 1.0
 */
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 s = new SaleTicket1();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class SaleTicket1 implements Runnable {
    int ticket = 10;
    boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            //synchronized (this) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            show();
            //}
        }
    }

    public synchronized void show() { //此时的同步监视器是：this

        if (ticket > 0) {
            try {
                // 模拟延时
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票号：" + ticket--);
        } else {
            isFlag = false;
        }
    }
}
