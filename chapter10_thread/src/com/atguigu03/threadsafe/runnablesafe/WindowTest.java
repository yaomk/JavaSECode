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
    final Object obj = new Object();
    final Dog dog = new Dog();
    int ticket = 10;

    @Override
    public void run() {
        //synchronized (this) { // 不能放在这里，会导致抢先进入的线程执行完此 run() 方法，其他的线程才能执行。
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //synchronized (obj){ // obj: 是唯一的吗？ yes
            //synchronized (dog){ // dog: 是唯一的吗？ yes
            synchronized (this) { // this: 是唯一的吗？ yes，就是 上边 SaleTicket 的实例对象 s
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
            //}
        }
    }
}

class Dog {
}