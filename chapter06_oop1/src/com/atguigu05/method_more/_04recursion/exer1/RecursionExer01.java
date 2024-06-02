package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecursionExer01
 * Description:
 * @Author yao
 * @Create 2024/6/2 下午12:00
 * @Version 1.0
 */
public class RecursionExer01 {
    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(f2(10));
    }

    /**
     * 练习1：
     * 已知一个数列：f(20) = 1, f(21) = 4, f(n+2) = 2*f(n+1)+f(n)
     * 其中n是大于0的整数，求f(10)的值
     * @param num
     * @return
     */
    static int f(int num) {
        if(num == 20) {
            return 1;
        } else if(num == 21) {
            return 4;
        }
        return f(num + 2) - 2 * f(num + 1);
    }

    /**
     * 练习2：
     * 已知一个数列：f(0) = 1, f(1) = 4
     * f(n+2) = 2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值
     * @param num
     * @return
     */
    static int f2(int num) {
        if(num == 1){
            return 4;
        } else if(num == 0) {
            return 1;
        }
        return 2*f2(num - 1) + f2(num - 2);
    }
}
