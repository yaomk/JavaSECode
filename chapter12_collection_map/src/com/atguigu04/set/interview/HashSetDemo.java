package com.atguigu04.set.interview;

import java.util.HashSet;

/**
 * ClassName: HashSetDemo
 * Description:
 *
 * @Author yao
 * @Create 2026/5/10 12:31
 * @Version 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        hashSet.add(p1); // 添加入 HashSet，调用了 Person 的 hashCode() 方法，hashCode:34072
        hashSet.add(p2);
        System.out.println(hashSet);
        p1.setName("CC");
        /*
         * 为什么会没有移除掉 p1？
         * 因为使用了 hashCode() 方法，此时计算出来的 hashCode:34136 与 首次添加进入的 p1 不同
         * 导致移除失败
         * */
        hashSet.remove(p1);
        System.out.println(hashSet); // 还是两个元素
        System.out.println(hashSet.contains(p1)); // false

        hashSet.add(new Person(1001, "CC")); // 添加成功
        System.out.println(hashSet); // 打印出了三个元素

        /*
         * 此时添加了new Person(1001, "AA")，hashCode与 p1 相同，然后会调用 equals() 方法
         * equals() 返回了 false，所以添加成功。
         * */
        hashSet.add(new Person(1001, "AA")); // 添加成功
        System.out.println(hashSet); // 打印出了四个元素
    }
}
