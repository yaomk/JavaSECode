package com.atguigu04.example.exer05_objarr1;
// 何为对象数组？
// 数组的元素可以是基本数据类型，也可以是引用数据类型，当元素是引用类型中的类时，我们称为对象数组。
/**
 * ClassName: Student
 * Description:
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)
 *
 * @Author yao
 * @Create 2024/5/26 上午10:18
 * @Version 1.0
 */
public class Student {
    /** 学号 */
    int number;
    /** 年级 */
    int state;
    /** 成绩 */
    int score;

    // 声明一个方法，显示学生的属性信息
    public String show() {
        return "number: " + number + ", state: "
                + state + ", score: " + score;
    }
}
