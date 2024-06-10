package com.atguigu08.constructor.exer1;

/**
 * ClassName: Student
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 下午3:32
 * @Version 1.0
 */
public class Student {
    String name; // 姓名
    int age; // 年龄
    String school; // 学校
    String major; // 专业

    public Student(String n, int a) {
        name = n;
        age = a;
    }
    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }
    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo() {
        return "name = " + name + ", age = " + age + ", school = " + school + ", major = " + major;
    }
}
