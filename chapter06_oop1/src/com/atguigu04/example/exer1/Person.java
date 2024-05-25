package com.atguigu04.example.exer1;

/**
 * ClassName: Person
 * Description:
 * 创建 Person 类的对象，设置该对象的name，age，gender
 * 调用 study 方法，输出字符串 studying
 * 调用 showAge 方法，返回 age 值
 * 调用 addAge 方法给对象的 age 属性值增加 addAge岁，比如 2 岁
 *
 * @Author yao
 * @Create 2024/5/25 上午10:59
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study() {
        System.out.println("studying");
    }
    public int showAge() {
        return age;
    }
    public void addAge(int addAge) {
        System.out.println(this);
        //this.age += addAge;
        age += addAge;
    }
}
