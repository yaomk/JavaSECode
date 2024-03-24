package com.atguigu1.one.exer1;

import java.util.Scanner;

/**
 * ClassName: ArrayExer01
 * Description: 案例
 *
 * 输出英文星期几
 *
 * 用一个数组，保存星期一到星期天的7个英文单词，从键盘输入1-7，显示对应的单词
 * {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
 *
 * @Author yao
 * @Create 2024/3/24 10:45
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        // 定义包含7个单词的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanInstance = new Scanner(System.in);
        while(true) {
            System.out.print("请输入数值（1-7）：");
            int day = scanInstance.nextInt();
            if(day < 1 || day > 7) {
                System.out.print("输入的数据有误, 请重新输入：");
            } else {
                System.out.println(weeks[day - 1]);
                break;
            }
        }
        scanInstance.close();

    }
}
