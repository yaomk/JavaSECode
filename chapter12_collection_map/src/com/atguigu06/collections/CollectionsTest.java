package com.atguigu06.collections;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/23 10:42
 * @Version 1.0
 */
public class CollectionsTest {
    // 排序操作：
    @Test
    public void test1() {
        List list = Arrays.asList(35, 12, 6, 7, 1, 4, 2, 24645);
        System.out.println(list);
        // reverse(List): 反转 List 中的元素顺序
        Collections.reverse(list);
        System.out.println(list);

        // shuffle(List): 对 List 中元素进行随机排序
        Collections.shuffle(list);
        System.out.println(list);

        // sort(List): 根据元素的自然顺序对指定 List 集合元素按升序排序
        Collections.sort(list);
        System.out.println(list);

        // sort(List, Comparator): 根据指定 Comparator 产生的顺序对 List 集合元素进行排序
        // Collections.sort(list, (o1, o2)-> {
        //     if(o1 instanceof Integer i1 && o2 instanceof Integer i2) {
        //         // return i2.intValue() - i1.intValue();
        //         return i2 - i1;
        //     }
        //     throw new RuntimeException("类型不匹配");
        // });
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer i1 && o2 instanceof Integer i2) {
                    // 从大到小排序
                    return i2 - i1;
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        System.out.println(list);

    }

    @Test
    public void test2() {
        List list = Arrays.asList(1, 35, 12, 6, 7, 1, 4, 2, 24645, 3);
        System.out.println(list);
        // Object max(Collection): 根据元素的自然排序，返回给定的集合中的最大元素
        // Object max(Collection, Comparator): 根据 Comparator 指定的顺序，返回给定集合中的最大元素
        Object max = Collections.max(list);
        System.out.println(max);
        Object max1 = Collections.max(list, (o1, o2) -> {
            if (o1 instanceof Integer i1 && o2 instanceof Integer i2) {
                return i2 - i1;
            }
            throw new RuntimeException("类型不匹配");
        });
        System.out.println(max1); // 返回 1（相当于返回排序后的最右边的元素）

        // int binarySearch(List l, T key): 在 List 集合中查找某个元素的下标，但是 List 的元素必须是 T 或 T 的子类对象类型
        int idx = Collections.binarySearch(list, 1);
        System.out.println(idx);
        int idx1 = Collections.binarySearch(list, 1, (Object o1, Object o2) -> {
            if (o1 instanceof Integer i1 && o2 instanceof Integer i2) {
                return i2 - i1;
            }
            throw new RuntimeException("类型不匹配");
        });
        System.out.println(idx1);

        // frequency(Collection, Object): 返回集合中指定元素出现的次数
        int count = Collections.frequency(list, 1);
        System.out.println("1 出现了" + count + "次");
    }

    @Test
    public void test3() {
        List src = Arrays.asList(35, 12, 6, 7, 1, 4, 2, 24645);
        // void copy(List dest, List src): 将 src 中的内容复制到 dest 中
        /* 错误的写法
        List dest = new ArrayList();
        Collections.copy(dest, list); // java.lang.IndexOutOfBoundsException: Source does not fit in dest
        */
        List dest = Arrays.asList(new Object[src.size()]);
        Collections.copy(dest, src);
        System.out.println(dest);
    }

    @Test
    public void test4() {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        // 提供了多个 unmodifiableXxx() 方法，该方法返回指定 Xxx 的不可修改的试图。
        List list2 = Collections.unmodifiableList(list1);
        // 此时 list2 只能读，不能写入
        list2.add(4);
        System.out.println(list2);
        System.out.println(list2.get(0)); // 1
    }

    @Test
    public void test5() {
        // Collections 类中提供了多个 synchronizedXxx() 方法，该方法返回指定 Xxx 的同步视图。
        List list1 = new ArrayList();
        // 返回的 list2 就是线程安全的
        List list2 = Collections.synchronizedList(list1);
        list2.add(2); // public boolean add(E e) { synchronized (mutex) {return c.add(e);} }

        HashMap map1 = new HashMap();
        // 返回的 map2 就是线程安全的
        Map map2 = Collections.synchronizedMap(map1);
    }
}
