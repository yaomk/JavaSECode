package com.atguigu12.wrapper.interview;

/**
 * ClassName: InterviewTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/9/9 11:18
 * @Version 1.0
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); // false

        // 底层都是使用了 Integer.valueOf()
        Integer m = 1; // 自动装箱
        Integer n = 1;
        System.out.println(m == n); // true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false

    }
}
