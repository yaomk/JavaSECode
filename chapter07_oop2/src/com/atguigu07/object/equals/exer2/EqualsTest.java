package com.atguigu07.object.equals.exer2;

/**
 * ClassName: EqualsTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 13:11
 * @Version 1.0
 */
public class EqualsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(10, 8, 2024);
        MyDate m2 = new MyDate(10, 8, 2024);
        MyDate m3 = null;
        System.out.println(m1.equals(m3));
        if (m1 == m2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");
        } else {
            System.out.println("m1 is not equal to m2");
        }

    }
}
