package com.atguigu02.selfdefine.exer3;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author yao
 * @Create 2026/6/13 11:59
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("Tom", "良好");
        Student<Double> s2 = new Student<>("Jerry", 90.9); // 90.9 自动装箱
        Student<Character> s3 = new Student<>("Rose", 'A'); // 'A' 自动装箱

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
