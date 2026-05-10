package com.atguigu04.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: TreeSetTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/10 11:55
 * @Version 1.0
 */
public class TreeSetTest {
    /*
     * 自然排序，String 类实现了 Comparable 接口
     * */
    @Test
    public void test1() {
        TreeSet treeSet = new TreeSet();
        treeSet.add("CC");
        treeSet.add("AA");
        treeSet.add("BB");
        treeSet.add("ZZ");
        treeSet.add("GG");

        // treeSet.add(123); // 会报错：java.lang.ClassCastException

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
     * 自然排序
     * */
    @Test
    public void test2() {
        TreeSet treeSet = new TreeSet();
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 12);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 42);

        treeSet.add(u1);
        treeSet.add(u2);
        treeSet.add(u3);
        treeSet.add(u4);
        treeSet.add(u5);
        System.out.println(treeSet);
        System.out.println();
        for (Object o : treeSet) {
            System.out.println(o);
        }
    }

    /*
     * 定制排序
     * */
    @Test
    public void test3() {
        Comparator comparator = new Comparator() {
            /*
             * 按照姓名从小到大排序，如果姓名相同，继续比较年龄，从大到小排序
             * */
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User u1 && o2 instanceof User) {
                    User u2 = (User) o2;
                    int value = u1.getName().compareTo(u2.getName());
                    if (value != 0) {
                        return value;
                    }
                    return u2.getAge() - u1.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 43);
        User u3 = new User("Rose", 12);
        User u4 = new User("Jack", 23);
        User u5 = new User("Tony", 42);
        User u6 = new User("Tom", 32);

        treeSet.add(u1);
        treeSet.add(u2);
        treeSet.add(u3);
        treeSet.add(u4);
        treeSet.add(u5);
        treeSet.add(u6);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
