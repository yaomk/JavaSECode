package com.atguigu03.field_method.method.exer;

/**
 * ClassName: Employee
 * Description:
 * 声明员工类 Employee，包含属性：编号id，姓名name，年龄age，薪资salary
 *声明EmployeeTest 测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工信息
 *
 * @Author yao
 * @Create 2024/5/18 上午10:47
 * @Version 1.0
 */
public class Employee {
    // 属性
    String name; // 姓名
    int id; // 编号
    int age; // 年龄
    double salary; // 薪资

    //定义一个方法，用于显示员工的属性信息
    public void show() {
        System.out.println("Name: " + name + " ID: " + id + " Age: " + age + " Salary: " + salary);
    }
    public String show1() {
        return "Name: " + name + ", ID: " + id + ", Age: " + age + ", Salary: " + salary;
    }
}
