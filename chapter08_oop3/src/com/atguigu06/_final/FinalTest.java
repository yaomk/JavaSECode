package com.atguigu06._final;

/**
 * ClassName: FinalTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/31 10:29
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        A aIns = new A();
        System.out.println(aIns.getClass());
        System.out.println(aIns.MAX_SCORE);

        A aIns1 = new A(11);
        System.out.println(aIns.LEFT);
        aIns1.setLeft(3);
        aIns1.method(20);
        System.out.println(Math.PI);
    }
}

final class A {
    // 无法重写 Object类中的 getClass
    //public A getClass() {}

    // final修饰变量，一旦赋值就不能更改
    final int MIN_SCORE = 0;

    final int MAX_SCORE;

    final int LEFT;

    {
        //MIN_SCORE = 1;
        MAX_SCORE = 100;
    }

    public A() {
        LEFT = 10;
    }

    public A(int left) {
        LEFT = left;
    }

    public void method(final int num) {
        //num++;在调用此方法时，给形参进行赋值。一旦赋值就不可更改
        System.out.println(num);
    }

    public void setLeft(int v) {
        //LEFT = v;
        final int num;
        num = 2; // final 修饰局部变量时，必须要赋值
        System.out.println(num);
    }
}

// 无法继承A
//class B extends A {}
