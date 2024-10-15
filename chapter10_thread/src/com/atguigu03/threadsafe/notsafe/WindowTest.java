package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: WindowTest
 * Description:
 * 使用实现 Runnable 接口的方式，实现卖票
 *
 * @Author yao
 * @Create 2024/10/15 10:31
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();
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

class SaleTicket implements Runnable {
    int ticket = 10;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    // 模拟延时
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "售票，票号：" + ticket--);
            } else {
                break;
            }
        }
    }
}
