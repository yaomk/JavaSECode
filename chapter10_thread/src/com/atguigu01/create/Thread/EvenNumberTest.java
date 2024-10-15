package com.atguigu01.create.Thread;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author yao
 * @Create 2024/10/7 11:40
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // ③ 创建当前 Thread 的子类对象
        PrintNumber p1 = new PrintNumber();
        // ④ 通过对象调用 start()
        p1.start();
        /*
         * 问题1：能否通过 p1.run() 替换 p1.start() 的调用，实现分线程的创建和调用。
         * 不能！直接调用 p1.run() 相当于在主线程中执行了p1的普通方法。
         * */
        //p1.run();

        /*
         * 问题2：再提供一个分线程，用于100以内偶数的遍历。
         * 注意：不能让已经 start() 的线程，再次执行 start()，否则报异常 IllegalThreadStateException
         * */
        //p1.start();
        // 需要重新创建对象以再次执行分线程操作。
        PrintNumber p2 = new PrintNumber();
        p2.start();

        // main() 所在的线程执行的操作：
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********");
            }
        }
    }
}

// ① 创建一个继承于 Thread 类的子类
class PrintNumber extends Thread {
    // ② 重写 Thread 类的 run() --> 将此线程要执行的操作，声明在此方法中
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                // Thread.currentThread() 返回对当前正在执行的线程对象的引用
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}