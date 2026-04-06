package com.atguigu03.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Description:
 *
 * @Author yao
 * @Create 2026/1/25 11:23
 * @Version 1.0
 */
public class ListTest {
    @Test
    public void test1() {
        List list = new ArrayList();

        list.add("AA");
        list.add("BB");
        list.add(123); // 自动装箱
        list.add(new Person("Tom", 12));
        System.out.println(list.toString());

        list.add(2, "CC");
        System.out.println(list);

        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(1, list1);
        list.add(1, list1); // 将 list1 整体作为一个元素，插入到索引 1 的位置
        System.out.println(list);
    }

    @Test
    public void test2() {
        List list = new ArrayList();

        list.add("AA");
        list.add(2); // 自动装箱
        list.add("BB");
        list.add(new Person("Tom", 12));

        // 删除索引2的元素
        list.remove(2);
        System.out.println(list);
        // 删除元素2
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }

    @Test
    public void test3() {
        List list = new ArrayList();

        list.add("AA");
        list.add("BB");
        list.add(123); // 自动装箱
        list.add(new Person("Tom", 12));
        // 遍历方式1：使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        // 遍历方式2：增强 for 循环
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
        // 遍历方式3：一般的 for 循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
