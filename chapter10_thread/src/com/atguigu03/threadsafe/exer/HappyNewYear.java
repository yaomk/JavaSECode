package com.atguigu03.threadsafe.exer;

/**
 * ClassName: HappyNewYear
 * Description:
 *
 * @Author yao
 * @Create 2024/10/15 11:58
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 0) {
                System.out.println("Happy New Year");
            } else {
                System.out.println(i);
            }
        }
    }
}
