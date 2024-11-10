package com.atguigu06.createmore.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * ClassName: ThreadPool
 * Description:
 *
 * @Author yao
 * @Create 2024/11/10 15:40
 * @Version 1.0
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        System.out.println(service.getClass());
        // 设置线程池的属性
        service1.setMaximumPoolSize(50); // 设置线程池中线程数的上限

        // 2. 执行指定的线程的操作。需要提供实现 Runnable 接口或 Callable 接口实现类的对象。
        service.execute(new NumberThread()); // execute() 适合适用于 Runnable
        service.execute(new NumberThread1());

        //service.submit(Callable callable); 适合适用于 Callable

        // 3. 关闭连接池
        service.shutdown();
    }
}

class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " 奇数：" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " 偶数：" + i);
            }
        }
    }
}
