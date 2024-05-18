package com.atguigu02.oop;

/**
 * ClassName: Phone
 * Description:
 *
 * @Author yao
 * @Create 2024/5/12 上午11:29
 * @Version 1.0
 */
public class Phone {
    // 属性
    String name; // 品牌
    double price; // 价格

    public void call() {
        System.out.println("手机能够拨打电话");
    }
    public void sendMessage(String message) {
        System.out.println("发送信息：" + message);
    }
    public void playGame() {
        System.out.println("手机可以玩游戏");
    }
}
