package com.atguigu06.createmore.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * ClassName: CallableTest
 * Description:
 * 创建多线程的方式三：使用 Callable （jdk5.0新增）
 *
 * @Author yao
 * @Create 2024/11/10 15:00
 * @Version 1.0
 */
public class CallableTest {
    public static void main(String[] args) {
        // 3. 创建 Callable 接口实现类实例
        NumThread numThread = new NumThread();

        // 4. 将此 Callable 接口实现类的独享作为传递到 FutureTask 构造器中，创建 FutureTask 的对象
        FutureTask<Integer> futureTask = new FutureTask<>(numThread);

        // 5. 将 FutureTask 的对象作为参数传递到 Thread 类的构造器中， 创建 Thread 对象，并调用 start()
        Thread t1 = new Thread(futureTask);
        t1.start();
        System.out.println(Thread.currentThread().getName() + "线程- main()");

        try {
            // 6. 获取 Callable 中的 call() 的返回值
            // get() 返回值即为 FutureTask 构造器参数 Callable 实现类重写的 call() 的返回值。
            Integer num = futureTask.get(); // 分线程执行完之前会阻塞主线程
            System.out.println("总和为：" + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 1.创建一个实现 Callable 的实现类
class NumThread implements Callable<Integer> {
    // 2.实现 call 方法，将此线程需要执行的操作声明在 call() 中
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(50);
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}