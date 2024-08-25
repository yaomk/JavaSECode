package com.atguigu05.field.interview;

/**
 * ClassName: Test02
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 11:48
 * @Version 1.0
 */
public class Test02 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void Method() {
        y = z++ + ++z;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x); // x=-1
        z--; // 此刻 z = -1
        Method(); // 此刻 y = 0, z = 1
        System.out.println("result:" + (z + y + ++z)); // result:3
    }
}
