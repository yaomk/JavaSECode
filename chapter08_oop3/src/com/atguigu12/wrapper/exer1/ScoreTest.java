package com.atguigu12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/9 11:00
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        //    1. 创建 vector 对象
        Vector v = new Vector();
        int maxScore = 0;
        //    2. 从键盘获取多个学生成绩
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入学生成绩（以负数代表输入结束）：");
            int intScore = scanner.nextInt();
            if (intScore < 0) {
                break;
            }
            // 装箱：int -> Integer
            //Integer score = Integer.valueOf(intScore);
            //v.addElement(score);
            // 添加学生成绩到容器 v 中， 自动装箱
            v.addElement(intScore);
            //    3. 获取学生成绩的最大值
            if (maxScore < intScore) {
                maxScore = intScore;
            }
        }
        System.out.println("最高分为：" + maxScore);
        //    4. 依次获取学生成绩，与最高分进行比较，获取学生等级，并输入
        for (int i = 0; i < v.size(); i++) {
            Object objScore = v.elementAt(i);
            //Integer integerScore = (Integer) objScore;
            //拆箱
            //int score = integerScore.intValue();
            // 自动拆箱
            int score = (Integer) objScore;
            char qrade = ' ';
            if (maxScore - score <= 10) {
                qrade = 'A';
            } else if (maxScore - score <= 20) {
                qrade = 'B';
            } else if (maxScore - score <= 30) {
                qrade = 'C';
            } else {
                qrade = 'D';
            }
            System.out.println("student " + (i + 1) + " score = " + score + " qrade = " + qrade);
        }

        scanner.close();
    }
}
