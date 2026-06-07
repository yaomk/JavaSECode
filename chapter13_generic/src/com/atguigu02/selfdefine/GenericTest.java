package com.atguigu02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName: GenericTest
 * Description:
 *
 * @Author yao
 * @Create 2026/6/7 10:06
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1() {
        Person person = new Person();

        // Person<String> person1 = new Person<>();

        ArrayList<String> arrayList = new ArrayList<>();

        ArrayList arrayList1 = new ArrayList(); // 向下兼容。jdk 5.0 之前集合是没有声明为泛型的。

        arrayList1.add(123);
        arrayList1.add("Tom");
    }

    // 自定义泛型类
    @Test
    public void test2() {
        Order order = new Order(); // 不等价于 Order<Object> order = new Order<>();
        Object t = order.getT();
        System.out.println(t);

        // Order<int> order1 = new Order<>(); // 泛型参数在指明时，必须是引用类型，不可以使用基本类型，但可以使用包装类。
        // 在实例化时，可以指明类的泛型参数的具体类型！一旦指明，则在泛型类中凡是使用泛型参数的位置，都替换为指定的类型。
        Order<Integer> order1 = new Order<>();
        order1.setT(123);
        Integer t1 = order1.getT();
        System.out.println(t1);
    }

    @Test
    public void test3() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1, 2, 3, 4};

        ArrayList<Integer> list = order.copyFromArrayToList(arr);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
