package com.atguigu02.selfdefine.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Exer02
 * Description:
 *
 * @Author yao
 * @Create 2026/6/13 11:47
 * @Version 1.0
 */
public class Exer02 {
    // 编写一个泛型方法，实现任意引用类型数组指定位置元素交换
    public static <E> void method1(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    // 编写一个泛型方法，接受一个任意引用类型的数组，并反转数组中的所有元素
    public static <E> void method2(E[] e) {
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }

    @Test
    public void test1() {
        String[] strings = {"Tom", "Jerry", "Mike"};
        System.out.println(Arrays.toString(strings));
        method1(strings, 0, 2);
        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void test2() {
        Integer[] integers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(integers));
        method2(integers);
        System.out.println(Arrays.toString(integers));
    }
}
