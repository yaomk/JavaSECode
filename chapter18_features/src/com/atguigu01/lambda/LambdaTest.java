package com.atguigu01.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: LambdaTest
 * Description:
 *
 * @Author yao
 * @Create 2026/9/6 10:29
 * @Version 1.0
 */
public class LambdaTest {
    @Test
    public void test() {
        // 1. 提供了实现了 Runnable 接口的类
        class MyRunnable implements Runnable {
            @Override
            public void run() {
                System.out.println("MyRunnable 类实现了 Runnable 接口。");
            }
        }
        // 匿名对象的调用方法
        new MyRunnable().run();
        System.out.println();
        // 2. 提供了接口的匿名实现类的对象
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world！");
            }
        };
        r1.run();
        System.out.println("******************************");

        // 3. lambda 表达式写法
        Runnable r2 = () -> {
            System.out.println("hello world! invoked by r2");
        };
        r2.run();
        Runnable r3 = () -> System.out.println("hello world! invoked by r3");
        r3.run();
    }

    @Test
    public void test2() {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(12, 22));
        System.out.println("******************************");
        // lambda 表达式写法
        // Comparator<Integer> comparator1 = (Integer o1, Integer o2) -> Integer.compare(o2, o1);
        // 数据类型可省略，因为可由编译器自动推断得出，称为：类型推断
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o2, o1);
        System.out.println(comparator1.compare(12, 22));
        System.out.println("******************************");

        // 方法引用
        Comparator<Integer> comparator3 = Integer::compare;
        System.out.println(comparator3.compare(12, 22));
    }

    @Test
    public void test3() {
        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = {1, 3, 4}; // 类型推断
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map1 = new HashMap<>();  // 类型推断

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        var entries1 = map.entrySet();  // 类型推断（var），在 jdk 10 及以上可用
    }

    @Test
    public void test4() {
        MyFunctionalInterface m = () -> System.out.println("hello!");
        m.method();
    }
}
