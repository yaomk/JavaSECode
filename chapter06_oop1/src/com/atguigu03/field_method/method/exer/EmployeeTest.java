package com.atguigu03.field_method.method.exer;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/18 上午10:48
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建类的实例（或创建类的对象、类的实例化）
        Employee emp1 = new Employee();
        System.out.println(emp1); // 类型@地址值
        System.out.println("id = " + emp1.id + ", name = " + emp1.name + ", age = " + emp1.age + ", salary = " + emp1.salary);
        emp1.show();

        emp1.id = 1000;
        emp1.name = "Tom";
        emp1.age = 24;
        emp1.salary = 8080;
        System.out.println("id = " + emp1.id + ", name = " + emp1.name + ", age = " + emp1.age + ", salary = " + emp1.salary);
        emp1.show();

        //System.out.println(emp1.show()); 编译不通过
        System.out.println(emp1.show1()); // 编译通过

        Employee emp2 = new Employee();
        System.out.println("id = " + emp2.id + ", name = " + emp2.name + ", age = " + emp2.age + ", salary = " + emp2.salary);
        emp2.show();

    }
}
