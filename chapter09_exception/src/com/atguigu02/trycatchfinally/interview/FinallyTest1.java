package com.atguigu02.trycatchfinally.interview;

import org.junit.Test;

/**
 * ClassName: FinallyTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/9/27 10:34
 * @Version 1.0
 */
public class FinallyTest1 {
    public static void main(String[] args) {
        int result = test("12");
        System.out.println(result); // test 结束 ; 1
    }

    static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test 结束");
        }
    }

    @Test
    public void test1() {
        try {
            System.out.println(Integer.parseInt("adc"));
        } finally {
            System.out.println("test1 结束");
        }
    }
}

class FinallyTest2 {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result); // test 结束 ; -1
    }

    static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test 结束");
        }
    }
}

class FinallyTest3 {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result); // test 结束 ; 0
    }

    static int test(String str) {
        try {
            Integer.parseInt(str);
            return 1;
        } catch (NumberFormatException e) {
            return -1;
        } finally {
            System.out.println("test 结束");
            return 0;
        }
    }
}

class FinallyTest4 {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    static int test(int num) {
        try {
            return num;
        } catch (NumberFormatException e) {
            return num--;
        } finally {
            System.out.println("test 结束");
            //return ++num; // test 结束 ; 11
            ++num; // test 结束 ; 10
        }
    }
}
