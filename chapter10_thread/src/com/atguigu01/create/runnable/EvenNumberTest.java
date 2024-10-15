package com.atguigu01.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author yao
 * @Create 2024/10/9 15:59
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // ③ 创建当前实现类的对象
        EvenNumberPrint p = new EvenNumberPrint();
        // ④ 将此对象作为参数传递到 Thread 类的构造器中，创建 Thread 类的实例
        Thread t1 = new Thread(p);
        // ⑤ Thread 类的实例调用 start(): 1.启动线程；2.调用当前线程的 run()
        t1.start();

        // main 方法对应的主线程执行的操作
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }

        // 再创建一个线程
        new Thread(p).start();

    }
}

// ① 创建一个实现 Runnable 接口的类
class EvenNumberPrint implements Runnable {
    // ② 实现接口中的 run() --> 将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
