package com.atguigu03.list.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: InterviewTest
 * Description:
 *
 * @Author yao
 * @Create 2026/4/6 10:54
 * @Version 1.0
 */
public class InterviewTest {
    @Test
    public void testListRemove() {
        List<Integer> list = new ArrayList<>();
        list.add(1); // 自动装箱
        list.add(2);
        list.add(3);
        list.add(128);
        updateList(list);
        System.out.println(list);
    }
    private static void updateList(List<Integer> list) {
        list.remove(2); // 删除的是索引2
        list.remove(Integer.valueOf(2)); // 删除的是元素2
        list.remove(Integer.valueOf(128)); // remove 内部使用的是 equals，所以能够删除。与 IntegerCache 无关。
    }
}
