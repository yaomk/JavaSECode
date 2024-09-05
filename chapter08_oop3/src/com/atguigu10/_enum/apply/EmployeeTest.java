package com.atguigu10._enum.apply;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/5 11:55
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", 12, Status.BUSY);
        System.out.println(employee1);
    }
}
