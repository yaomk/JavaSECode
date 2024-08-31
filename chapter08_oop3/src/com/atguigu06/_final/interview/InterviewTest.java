package com.atguigu06._final.interview;

/**
 * ClassName: InterviewTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/31 10:58
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        System.out.println(addOne(1));
        addOne(new Other());
    }

    static int addOne(final int x) {
        //return ++x; // 不可更改 final 修饰的变量
        return x + 1;
    }

    static void addOne(final Other o) {
        //o = new Other();
        o.i++;
        System.out.println(o.i);
    }
}

class Other {
    public int i;
}