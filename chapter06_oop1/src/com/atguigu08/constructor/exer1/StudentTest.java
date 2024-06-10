package com.atguigu08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 下午3:34
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 12, "猫和老鼠", "捉老鼠");
        System.out.println(s1.getInfo());

        Student s2 = new Student("Jerry", 12, "猫和老鼠");
        System.out.println(s2.getInfo());
    }
}
