package com.atguigu03.field_method.filed;

/**
 * ClassName: FieldTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/18 上午10:20
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        p1.sleep(8);
    }
}

class Person{
    // 属性（或成员变量）
    String name;
    int age;
    char gender;

    public void eat() {
        String food = "宫保鸡丁"; // 局部变量
        System.out.println("我喜欢吃" + food);
        String food2;
        // 报错，未进行初始化赋值
        //System.out.println(food2);
        // 不保存，打印name的初始化值，null
        System.out.println(name);
    }
    public void sleep(int hour) { // 形参：属于局部变量
        System.out.println("人不能少于" + hour + "小时的睡眠");

        // 编译不通过，因为超出了 food 变量的作用域
        //System.out.println("我喜欢吃" + food);

        System.out.println();
    }
}
