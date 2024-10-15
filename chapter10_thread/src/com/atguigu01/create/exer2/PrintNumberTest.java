package com.atguigu01.create.exer2;

/**
 * ClassName: PrintNumberTest
 * Description:
 *
 * @Author yao
 * @Create 2024/10/9 16:06
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        // 提供了 Runnable 接口匿名实现类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + "偶数:" + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                if (i % 2 != 0)
                    System.out.println(Thread.currentThread().getName() + "奇数:" + i);
            }
        }).start();
    }
}
