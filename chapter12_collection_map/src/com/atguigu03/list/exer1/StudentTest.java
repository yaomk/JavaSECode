package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author yao
 * @Create 2026/2/10 11:28
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        System.out.println("请录入学生信息：");
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();
        while (true) {
            System.out.println("1: 继续录入，0：结束录入");
            int selection = sc.nextInt();
            if (selection == 0) break;
            System.out.print("请输入学生的姓名：");
            String name = sc.next();
            System.out.print("请输入学生的年龄：");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            list.add(student);
        }
        System.out.println("遍历学生信息：");
        for (Object o : list) {
            System.out.println(o);
        }
        sc.close();
    }
}
