package com.atguigu01.use;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionMapTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/31 12:02
 * @Version 1.0
 */
public class CollectionMapTest {
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(75);
        list.add(233);
        list.add(14);
        // 问题1：类型不安全，因为add()的参数是Object类型，意味着任何类型的对象都可以添加成功
        // list.add("AA");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            // 问题2：需要使用强转类型操作，繁琐。还有可能导致ClassCastException异常
            int score = (Integer) iterator.next();
            System.out.println(score);
        }
    }

    @Test
    public void test2() {
        // 完整写法
        // ArrayList<Integer> list = new ArrayList<Integer>();
        // jdk7的新特性， 可以省略，类型推断
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(343);
        list.add(11);
        // list.add("aa"); // 编译报错，保证类型的安全
        // Iterator<Integer> iterator = list.iterator();
        /* var 是 Java 10 引入的一个特性，用于局部变量类型推断。
          它允许你在声明局部变量时省略显式的类型声明，
          由编译器根据赋值语句右侧的表达式自动推断出变量的实际类型。
         */
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            // 因为添加的都是 Integer 类型，避免了强转操作
            int score = iterator.next();
            System.out.println(score);
        }
    }

    /**
     * 泛型在 Map 中使用
     */
    @Test
    public void test3() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tom", 12);
        hashMap.put("Jerry", 23);
        hashMap.put("Mike", 34);
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "=" + value);
        }
    }
}










