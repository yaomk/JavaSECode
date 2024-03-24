package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Description: 案例：学生等级划分
 * <p>
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级
 * 成绩 >= 最高分 - 10  等级为 A
 * 成绩 >= 最高分 - 20  等级为 B
 * 成绩 >= 最高分 - 30  等级为 C
 * 其余  等级为 D
 *
 * @Author yao
 * @Create 2024/3/24 11:04
 * @Version 1.0
 */
public class ArrayExer02_1 {
    public static void main(String[] args) {
        // 1. 从键盘输入学生人数，根据人数，创建数组（动态初始化）
        Scanner scanInstance = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = scanInstance.nextInt();
        int[] scores = new int[count];
        // 2. 根据提示，一次输入学生成绩，并将成绩保存在数组中
        int maxScore = scores[0];
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanInstance.nextInt();
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是：" + maxScore);
        // 4. 遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        char grade = 0; // char类型占用两个字节，表数分为0 ~ 2^16-1，取unicode编码对应的字符

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                grade = 'A';
            } else if (scores[i] >= maxScore - 20) {
                grade = 'B';
            } else if (scores[i] >= maxScore - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("student" + i + " score is " + scores[i] + " grade is " + grade);

        }
        scanInstance.close();
    }
}
