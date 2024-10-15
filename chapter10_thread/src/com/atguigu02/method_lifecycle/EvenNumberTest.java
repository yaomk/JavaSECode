package com.atguigu02.method_lifecycle;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author yao
 * @Create 2024/10/9 16:50
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        Thread t = new Thread(new EvenNumberPrint(), "线程1");
        t.setName("重写名称后的线程");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "::" +
                    Thread.currentThread().getPriority() + "::" + i);
            if (i == 20) {
                //try {
                //    t.join();
                //} catch (InterruptedException e) {
                //    throw new RuntimeException(e);
                //}
            }
        }
        //t.stop();
        System.out.println(t.getName() + "是否存活？" + t.isAlive());
    }
}

class EvenNumberPrint implements Runnable {
    public EvenNumberPrint() {
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            //try {
            //    Thread.sleep(1000);
            //} catch (InterruptedException e) {
            //    e.printStackTrace();
            //}
            System.out.println(Thread.currentThread().getName() + "::EvenNumberPrint  "
                    + Thread.currentThread().getPriority() + "::" + i);
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
