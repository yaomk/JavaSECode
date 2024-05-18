package com.atguigu01.memory;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2024/5/12 上午11:46
 * @Version 1.0
 */
public class Person {
    //属性
    String name; // 姓名
    int age; // 年龄
    char gender; // 性别

    //方法
    public void eat() {
        System.out.println("人吃饭");
    }
    public void sleep(int hour) {
        System.out.println("人至少保证明天" + hour + "小时的睡眠");
    }
    public void interests(String hobby) {
        System.out.println("我的爱好是 " + hobby);
    }
}
