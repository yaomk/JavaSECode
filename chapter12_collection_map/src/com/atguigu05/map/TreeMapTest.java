package com.atguigu05.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName: TreeMapTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/4 10:09
 * @Version 1.0
 */
public class TreeMapTest {
    @Test
    /*
      自然排序
     */
    public void test() {
        TreeMap treeMap = new TreeMap();
        treeMap.put("CC", 34);
        treeMap.put("AA", 123);
        treeMap.put("BB", 344);
        /*
        报错：因为 key 的类型（Integer）与之前的 key 的类型（String）不一致
        treeMap.put(34,31); // java.lang.ClassCastException: class java.lang.String cannot be cast to class java
         */
        // .lang.Integer
        for (Object o : treeMap.entrySet()) {
            System.out.println(o);
        }

    }

    @Test
    public void test2() {
        TreeMap<User, Integer> treeMap = new TreeMap<>();
        // TreeMap 添加对象作为键时，对象需要实现 Comparable 接口
        User u1 = new User("Tom", 23);
        User u2 = new User("Jerry", 12);
        User u3 = new User("Rose", 12);
        User u4 = new User("Mike", 33);

        treeMap.put(u1, 123);
        treeMap.put(u2, 1);
        treeMap.put(u3, 2);
        treeMap.put(u4, 45);

        System.out.println(treeMap.containsKey(new User("Maria", 33)));

        treeMap.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    /**
     * 定制排序
     */
    @Test
    public void test3() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int value = u1.getName().compareTo(u2.getName());
                    if (value != 0) {
                        return value;
                    }
                    return u1.getAge() - u2.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        TreeMap treeMap = new TreeMap(comparator);
        // TreeMap 添加对象作为键时，对象需要实现 Comparable 接口
        User u1 = new User("H", 23);
        User u2 = new User("A", 12);
        User u3 = new User("X", 12);
        User u4 = new User("B", 33);
        User u5 = new User("A", 11);

        treeMap.put(u1, 123);
        treeMap.put(u2, 1);
        treeMap.put(u3, 2);
        treeMap.put(u4, 45);
        treeMap.put(u5, 2);
        Set entrySet = treeMap.entrySet();
        for (Object o : entrySet) {
            System.out.println(o);
        }

    }
}
