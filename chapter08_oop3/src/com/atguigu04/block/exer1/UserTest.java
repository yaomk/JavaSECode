package com.atguigu04.block.exer1;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 10:37
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom", "654321");
        System.out.println(u2.getInfo());

        UserByBlock u3 = new UserByBlock("Jack", "152233");
        System.out.println(u3.getInfo());
    }
}
