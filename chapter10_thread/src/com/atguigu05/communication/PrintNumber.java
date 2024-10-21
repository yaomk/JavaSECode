package com.atguigu05.communication;

/**
 * ClassName: PrintNumber
 * Description:
 *
 * @Author yao
 * @Create 2024/10/21 16:43
 * @Version 1.0
 */
public class PrintNumber implements Runnable {
    private final Object obj = new Object();
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            //synchronized (this){
            synchronized (obj) {
                // 一旦执行此方法 `notify()`，就会唤醒被 `wait()` 的线程中优先级最高的那一个线程。
                // （如果被 `wait()` 的多个线程的优先级相同，就随机唤醒一个）。
                // 被唤醒的线程从当初被 `wait()` 的位置继续执行。
                //this.notify();
                obj.notify();
                if (number <= 10) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number++);
                    try {
                        //this.wait(); // 线程一旦执行此方法，就进入等待方法。同时，会释放对同步监视器的调用。
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        new Thread(p, "线程1").start();
        new Thread(p, "线程2").start();
    }
}