package com.atguigu01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer02
 * Description:
 *
 * @Author yao
 * @Create 2026/5/31 13:04
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {
        // 1.创建一个 ArrayList 集合对象，并指定泛型为 <Integer>
        ArrayList<Integer> list = new ArrayList<>();

        // 2.添加 5个 [0,100) 以内的随机整数添加到集合中
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 100);
            list.add(random);
        }
        // 3.使用 for 循环遍历集合，并打印输出
        for (Integer i : list) {
            System.out.println(i);
        }
        // 4.使用集合的 removeIf 方法删除偶数，为 Predicate 接口指定泛型 <Integer>
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println();
        // 5. 使用 Iterator 迭代器输出剩下的元素，为 Iterator 接口指定泛型 <Integer>
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            var value = iterator.next();
            System.out.println(value);
        }
    }
}
