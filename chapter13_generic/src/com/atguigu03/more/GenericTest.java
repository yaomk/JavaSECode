package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: GenericTest
 * Description:
 *
 * @Author yao
 * @Create 2026/6/14 10:49
 * @Version 1.0
 */
public class GenericTest {
    public static void method(Person<Object> p) {
    }

    public static void method(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test1() {
        Object obj = null;
        String str = "AA";

        obj = str; // 基于继承性的多态的使用

        Object[] arr = null;
        String[] arr1 = {"AA", "BB", "CC"};

        arr = arr1; // 编译通过， 基于继承性的多态的使用
        arr[0] = 123; // 会产生运行时错误： java.lang.ArrayStoreException: java.lang.Integer
        Arrays.sort(arr);
        /*
         * java中数组是协变的（covariant），
         * 早期版本无泛型，为支持多态（例如：Arrays.sort(Object[] a) 处理各类数组），被迫设计为协变。
         */
    }

    @Test
    public void test2() {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        // list = list1; // 编译报错

        /*
         * 反证法：
         * 假设 list = list1; list1 可以赋值给 list
         *
         * list1.add("AA");
         * list = list1; // 引用类型赋值的是地址。
         * list.add(123);
         * String str = list1.get(1); // 相当于取出的 123 <Integer 类型>赋值给了 str <String 类型>。
         *
         * */
    }

    @Test
    public void test3() {
        Person<Object> per = new Person<>();
        Person<String> per1 = new Person<>();

        // per = per1;

        method(per);
        // method(per1); // 编译报错
    }

    @Test
    public void test4() {
        List<String> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();
        // ArrayList 是 List 的实现类

        list1 = list2;
        list1.add("AA");
        method(list1); // 编译通过
        method(list2); // 编译通过
    }


}
