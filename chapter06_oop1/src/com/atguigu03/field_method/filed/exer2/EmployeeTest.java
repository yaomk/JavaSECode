package com.atguigu03.field_method.filed.exer2;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/18 上午11:08
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建 Employee的一个实例
        Employee emp1 = new Employee();
        emp1.id = 1000;
        emp1.name = "Jack";
        //emp1.name = new String("Jack");
        emp1.age = 24;
        emp1.salary = 2800;
        emp1.birthday = new MyDate();
        emp1.birthday.year = 1990;
        emp1.birthday.month = 12;
        emp1.birthday.day = 28;
        /*
        * 另一个种写法：
        * MyDate md = new MyDate();
        * emp1.birthday = md;
        * */

        System.out.println("id = " + emp1.id + ", name = " + emp1.name + ", age = " + emp1.age + ", salary = " + emp1.salary
        + ", birthday = [" + emp1.birthday.year + "年" + emp1.birthday.month + "月" + emp1.birthday.day + "日]");
    }
}
