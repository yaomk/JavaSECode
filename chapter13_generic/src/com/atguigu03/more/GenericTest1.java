package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: GenericTest1
 * Description:
 *
 * @Author yao
 * @Create 2026/6/14 14:16
 * @Version 1.0
 */
public class GenericTest1 {
    public static void method(List<?> list) {
        if (list.isEmpty()) return;
        Object o = list.get(0);
        System.out.println(o);
    }

    @Test
    public void test1() {
        List<?> list = null;
        List<Object> list1 = new ArrayList<>(Arrays.asList(new Person<String>(), new Person<Integer>()));
        List<String> list2 = new ArrayList<>(Arrays.asList("AA", "BB", "CC"));

        method(list1);
        method(list2);

        list = list1;
        System.out.println(list);
        list = list2;
        System.out.println(list);

    }

    @Test
    public void test2() {
        List<?> list = null;
        List<String> list1 = new ArrayList<>();
        list1.add("AA");
        list = list1;
        // 读取，只能够作为 Object 读取
        Object o = list.get(0);
        System.out.println(o);
        // 写入
        // list.add("BB"); // 编译失败
        // 特例：可以将 null 写入
        list.add(null);
        System.out.println(list);

    }

    @Test
    public void test3() {
        List<? extends Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        // list = list1; // 编译报错
        list = list2;
        list = list3;
    }

    @Test
    public void test3_1() {
        List<? extends Father> list = null;
        List<Father> list1 = new ArrayList<>(List.of(new Father()));
        list = list1;
        // 读取安全：可以读取为 T 类型。
        Father father = list.get(0);
        System.out.println(father);

        // 写入数据
        list.add(null);
        // 添加受限：不能添加任何非 null 元素（因为编译器无法保证添加的对象是通配符下界的实际类型）。
        // list.add(new Father()); // 编译报错
        // list.add(new Son()); // 编译报错
    }

    @Test
    public void test4() {
        List<? super Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        list = list1;
        list = list2;
        // list = list3;  // 编译报错
    }

    @Test
    public void test4_1() {
        List<? super Father> list = null;
        List<Father> list1 = new ArrayList<>(List.of(new Father()));

        list = list1;
        // 读取受限：只能读取为 Object 类型，因为无法确定具体的父类型。
        Object o = list.get(0);
        System.out.println(o);

        list.add(null);
        // 添加安全：可以添加 T 及其子类型的对象。
        list.add(new Father());
        list.add(new Son());
        // list.add(new Object()); // 编译报错
    }
}
