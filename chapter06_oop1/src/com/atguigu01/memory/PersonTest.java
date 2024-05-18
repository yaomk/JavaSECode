package com.atguigu01.memory;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/12 上午11:49
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建对象、类的实例化
        Person p1 = new Person();

        //通过对象调用属性或方法
        p1.name = "杰克";
        p1.age = 20;
        p1.gender = '男';

        System.out.println("name= " + p1.name + ", age= " + p1.age + ", gender= " + p1.gender);
        p1.eat();
        p1.sleep(8);
        p1.interests("画画");

        // 再创建Person类的一个实例
        Person p2 = new Person();
        p2.name = "露丝";
        p2.age = 18;
        p2.gender = '女';
        System.out.println("name= " + p2.name + ", age= " + p2.age + ", gender= " + p2.gender);

    }
}
