package com.atguigu05._super;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/7 上午11:58
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();

        s1.show();

        s1.testSameField();

        System.out.println();
        Student s2 = new Student();
        System.out.println("***********");
        Student s3 = new Student(18 , "Tom");

        s3.show();
    }
}
