package com.atguigu03.threadsafe.notsafe;

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
        Window w1 = new Window("窗口1");
        Window w2 = new Window("窗口2");
        Window w3 = new Window("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread {
    static int ticket = 100;

    public Window() {
    }

    public Window(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
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
        }
    }
}
