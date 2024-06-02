package com.atguigu05.method_more._04recursion;

/**
 * ClassName: RecursionTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/2 上午11:33
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        //test.method1();

        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(100));
        System.out.println(test.factorial(5));
    }

    /**
     * 遍历计算指定数字内自然数的总和
     * @param num 指定数组
     * @return 总和
     */
    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    public int getSum1(int num) {
        if (num == 1) {
            return 1;
        }
        return getSum1(num - 1) + num;
    }

    /**
     * n! 求n的阶乘
     * @param num
     * @return
     */
    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    /**
     * 如下递归方法的调用，会导致StackOverflowError
     */
    public void method1() {
        System.out.println("method1()...");
        method1();
    }
}
