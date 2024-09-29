package com.atguigu05.exer.exer3;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/29 11:05
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom", 1);
        System.out.println(p);
        try {
            Person p1 = new Person("Jack", -10);
            System.out.println(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
