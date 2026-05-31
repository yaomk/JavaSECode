package com.atguigu01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author yao
 * @Create 2026/5/31 12:44
 * @Version 1.0
 */
public class EmployeeTest {
    // 需求1：使 Employee 实现 Comparable 接口，并按 name 排序
    @Test
    public void test1() {
        TreeSet<Employee> treeSet = new TreeSet<>();
        Employee e1 = new Employee("Tom", 12, new MyDate(1999, 1, 12));
        Employee e2 = new Employee("Jack", 22, new MyDate(1998, 2, 12));
        Employee e3 = new Employee("Anti", 21, new MyDate(2000, 4, 12));
        Employee e4 = new Employee("Rose", 55, new MyDate(1999, 5, 12));
        Employee e5 = new Employee("Mike", 63, new MyDate(1957, 6, 12));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        for (var e : treeSet) {
            System.out.println(e);
        }
    }

    // 需求2：创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序
    @Test
    public void test2() {
        Comparator<Employee> comparator = new Comparator<>() {
            /**
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             */
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate o1Birthday = o1.getBirthday();
                MyDate o2Birthday = o2.getBirthday();
                int yearDistinct = o1Birthday.getYear() - o2Birthday.getYear();
                if (yearDistinct != 0) {
                    return yearDistinct;
                }
                int monthDistinct = o1Birthday.getMonth() - o2Birthday.getMonth();
                if (monthDistinct != 0) {
                    return monthDistinct;
                }
                return o1Birthday.getDay() - o2Birthday.getDay();
            }
        };

        TreeSet<Employee> treeSet = new TreeSet<>(comparator);
        Employee e1 = new Employee("Tom", 12, new MyDate(1991, 1, 12));
        Employee e2 = new Employee("Jack", 22, new MyDate(1997, 2, 12));
        Employee e3 = new Employee("Anti", 21, new MyDate(2001, 4, 12));
        Employee e4 = new Employee("Rose", 55, new MyDate(1992, 5, 12));
        Employee e5 = new Employee("Mike", 63, new MyDate(1951, 6, 12));
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        for (var e : treeSet) {
            System.out.println(e);
        }
    }
}
