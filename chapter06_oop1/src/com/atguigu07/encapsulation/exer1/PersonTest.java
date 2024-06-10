package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午10:50
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(18);
        System.out.println("age = " + p.getAge());
    }
}
