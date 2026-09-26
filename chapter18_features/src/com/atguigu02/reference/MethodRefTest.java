package com.atguigu02.reference;

import com.atguigu02.reference.data.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: MethodRefTest
 * Description:
 *
 * @Author yao
 * @Create 2026/9/26 10:16
 * @Version 1.0
 */
public class MethodRefTest {

    // 情况1：对象::实例方法
    // Consumer 中的 void accept(T t)
    // PrintStream 中的 void println(T t)
    @Test
    public void test1() {
        // 1. 使用匿名实现类
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        // 2. 使用 lambda 表达式
        Consumer<String> con2 = s -> System.out.println(s);
        /*
        方法引用能替代 Lambda 的前提：
        Lambda 体只有一行代码，且这一行是直接调用某个已有方法（或构造器）。
        被引用方法的参数列表和返回值类型必须与函数式接口的抽象方法兼容。
        */
        Consumer<String> con2_bak = s -> {
            // 不符合 lambda 替换为方法引用的条件，所以编辑器不会提示让替换为方法引用。
            System.out.println("lambda 表达式");
            System.out.println(s);
        };

        // 3. 使用方法引用
        Consumer<String> con3 = System.out::println;
    }

    // Supplier 中的 T get()
    // Employee 中的 String getName()
    @Test
    public void test2() {
        Employee emp = new Employee("Jack", 11);
        // 1.
        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return emp.getName();
            }
        };
        System.out.println(sup1.get());

        // 2.
        Supplier<String> sup2 = () -> emp.getName();
        System.out.println(sup2.get());

        // 3.
        Supplier<String> sup3 = emp::getName;
        System.out.println(sup3.get());
    }

    // 情况2：类::静态方法
    // Comparator 中的 int compare(T t1, T t2)
    // Integer 中的 int compare(T t1, T t2)
    @Test
    public void test3() {
        // 1.
        Comparator<Integer> comp1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comp1.compare(11, 12));

        // 2.
        Comparator<Integer> comp2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comp2.compare(12, 11));

        // 3.
        Comparator<Integer> comp3 = Integer::compare;
        System.out.println(comp3.compare(12, 11));
    }

    // Function 中的 R apply(T t)
    // Math中的Long round(Double d)
    @Test
    public void test4() {
        // 1.
        Function<Double, Long> fun1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(fun1.apply(3.1415926));

        // 2.
        Function<Double, Long> fun2 = (aDouble) -> Math.round(aDouble);
        System.out.println(fun2.apply(3.1415926));

        // 3.
        Function<Double, Long> fun3 = Math::round;
        System.out.println(fun3.apply(3.1415926));
    }

    // 情况3：类::实例方法
    // Comparator 中的 int compare(T t1, T t2)
    // String 中的 int t1.compareTo(t2)
    @Test
    public void test5() {
        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comp1.compare("abc", "aba"));

        // 2.
        Comparator<String> comp2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comp2.compare("Abc", "abc"));

        // 3.
        Comparator<String> comp3 = String::compareTo;
        System.out.println(comp3.compare("Abc", "abc"));
    }

    // BiPredicate 中的 boolean test(T t1, T t2)
    // String的 boolean t1.equals(t2)
    @Test
    public void test6() {
        BiPredicate<String, String> bip1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };

        BiPredicate<String, String> bip2 = (s1, s2) -> s1.equals(s2);

        BiPredicate<String, String> bip3 = String::equals;
    }

    @Test
    public void test7() {
        Employee emp = new Employee("Rose", 11);
        Function<Employee, String> fun1 = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };

        Function<Employee, String> fun2 = employee -> employee.getName();
        System.out.println(fun2.apply(emp));

        Function<Employee, String> fun3 = Employee::getName;
        System.out.println(fun3.apply(emp));

    }
}
