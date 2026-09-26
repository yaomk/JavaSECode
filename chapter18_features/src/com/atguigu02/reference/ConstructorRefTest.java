package com.atguigu02.reference;

import com.atguigu02.reference.data.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: ConstructorRefTest
 * Description:
 *
 * @Author yao
 * @Create 2026/9/26 11:33
 * @Version 1.0
 */
public class ConstructorRefTest {
    // 构造器引用

    // Supplier 中的 T get()
    @Test
    public void test1() {
        Supplier<Employee> sup1 = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };

        Supplier<Employee> sup2 = () -> new Employee();

        Supplier<Employee> sup3 = Employee::new;
        System.out.println(sup3.get());
    }

    @Test
    public void test2() {
        Function<Integer, Employee> fun1 = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return new Employee("12");
            }
        };

        Function<Integer, Employee> fun2 = id -> new Employee(id);

        Function<Integer, Employee> fun3 = Employee::new;
        System.out.println(fun3.apply(10));

    }

    @Test
    public void test3() {
        BiFunction<Integer, String, Employee> bif1 = new BiFunction<Integer, String, Employee>() {
            @Override
            public Employee apply(Integer integer, String s) {
                return new Employee(s, integer);
            }
        };

        BiFunction<Integer, String, Employee> bif2 = (id, name) -> new Employee(name, id);

        BiFunction<Integer, String, Employee> bif3 = Employee::new;
        System.out.println(bif3.apply(1, "Jack"));
    }

    // 数组引用
    // Function 中的 R apply(T t)
    @Test
    public void test4() {
        Function<Integer, Employee[]> fun1 = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer integer) {
                return new Employee[integer];
            }
        };

        Function<Integer, Employee[]> fun2 = (len) -> new Employee[len];

        Function<Integer, Employee[]> fun3 = Employee[]::new;
        System.out.println(fun3.apply(10).length);
    }
}
