package com.atguigu05.method_more._04recursion.exer2;

/**
 * ClassName: FibonacciTest
 * Description:斐波那契数列
 * 第一项为1，第二项为1,第三项为2，第四项为3，第五项为5
 * n>2时，f(n) = f(n-1) + f(n-2)
 *
 * 奇妙的属性：随着数列的增加，斐波那契数列前一个数与后一个数的比值越来越接近黄金分割的数值 0.618
 * @Author yao
 * @Create 2024/6/2 下午12:18
 * @Version 1.0
 */
public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println(fibonacci(24));
        System.out.println(fibonacci2(24));
        System.out.println(fibonacci3(24));
        System.out.println(fibonacci4(24, 1, 1));
        System.out.println(step(10));
    }

    /**
     * 递归实现斐波那契数列
     * 时间复杂度O(n²),空间复杂度O(n)
     * @param num
     * @return
     */
    static int fibonacci(int num) {
        if(num <= 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    /**
     * 定义两个变量循环实现斐波那契
     * 时间复杂度O(n),空间复杂度O(1)
     * @param num
     * @return
     */
    static int fibonacci2(int num) {
        if(num <= 1) {
            return num;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i <= num; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * 使用动态规划思想
     * 时间复杂度O(n),空间复杂度O(n)
     * @param num
     * @return
     */
    static int fibonacci3(int num) {
        if(num <= 1) {
            return num;
        }
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }

    /**
     * 尾递归优化
     * 时间复杂度O(n),空间复杂度O(1)
     * @param num
     * @param n1
     * @param n2
     * @return
     */
    static int fibonacci4(int num, int n1, int n2) {
        if(num <= 2) {
            return n2;
        }
        return fibonacci4(num - 1, n2, n1 + n2);
    }

    /**
     * 走台阶问题
     * 假如有10阶台阶，小朋友每次只能向上走1阶或者2阶，请问一共有多少种不同的做法？
     * 例如：
     * 阶数：1  2  3  4  5 。。。
     * 走法：1  2  3  5  7 。。。
     * 从 n为3开始：
     * f(n) = f(n-1) + f(n-2)
     * @param num
     * @return
     */
    static int step(int num) {
        if(num == 1) {
            return 1;
        } else if(num == 2) {
            return 2;
        }
        return step(num - 1) + step(num - 2);
    }
}
