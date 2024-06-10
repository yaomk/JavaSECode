package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: Person
 * Description:
 * 创建程序，在其中定义两个类：Person和PersonTest类。
 * 用setAge()设置人的合法性年龄，用getAge()返回人的年龄
 * 在PersonTest类中实例化Person类，调用setAge，getAge方法，体会java的封装性
 *
 * @Author yao
 * @Create 2024/6/10 上午10:47
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int age) {
        if(age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("数据非法");
        }
    }
    public int getAge() {
        return age;
    }
}
