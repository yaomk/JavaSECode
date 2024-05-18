package com.atguigu02.oop;

import java.util.Scanner;

/**
 * ClassName: PhoneTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/12 上午11:33
 * @Version 1.0
 */
public class PhoneTest {
    // 是phone类的测试类
    public static void main(String[] args) {
        // 创建Phone的对象
        // 复习：数据类型 变量名 = 变量值
        Scanner scanIns = new Scanner(System.in);
        scanIns.close();

        // 创建Phone的对象
        Phone p1 = new Phone();
        // 通过Phone的对象，调用其内部的属性或方法
        p1.name = "huawei mate50 pro";
        p1.price = 6999;
        System.out.println("name= " + p1.name + ", price= " + p1.price);

        //调用方法
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}
