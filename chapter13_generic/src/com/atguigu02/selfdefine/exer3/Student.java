package com.atguigu02.selfdefine.exer3;

import java.util.Objects;

/**
 * ClassName: Student
 * Description:
 * 声明一个学生类，包含姓名、成绩。成绩类型为泛型类型。
 * 不同老师定义学生成绩不同，比如：优秀、良好、及格、不及格。A、B、C、D。
 *
 * @Author yao
 * @Create 2026/6/13 11:56
 * @Version 1.0
 */
public class Student<T> {
    private String name;
    private T score; // 成绩

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "学生：" + name + ", 成绩为：" + score;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student<?> student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
