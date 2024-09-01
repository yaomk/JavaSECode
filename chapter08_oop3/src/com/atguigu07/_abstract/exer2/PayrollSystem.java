package com.atguigu07._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Description:
 *
 * @Author yao
 * @Create 2024/9/1 12:06
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scannerIns = new Scanner(System.in);

        System.out.print("请输入当前的月份：");
        int month = scannerIns.nextInt();

        Employee[] emp = new Employee[2];
        emp[0] = new SalariedEmployee("Tom", 1000, new MyDate(1999, 12, 1), 2000);
        emp[1] = new HourlyEmployee("Jack", 1002, new MyDate(2000, 1, 2), 100, 160);

        for (Employee employee : emp) {
            System.out.println(employee);
            System.out.println("工资为：" + employee.earnings());
            if (month == employee.getBirthday().getMonth()) {
                System.out.println("生日快乐！加薪100");
            }
        }
        scannerIns.close();
    }
}
