package com.atguigu14.review;

/**
 * ClassName: StaticTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/12 16:52
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();

        Person p2 = null;
        p2.eat();

        p2.eat("啊");
        Student.eat();
        Student.eat("啊啊");
    }
}

class Person {
    public static void eat() {
        System.out.println("Person 吃饭");
    }

    public static void eat(String str) {
        System.out.println("person 吃饭" + str);
    }
}

class Student extends Person {
    public static void eat() {
        System.out.println("Student 吃饭");
    }
}

class MyClass {
    private final int myPrivateField = 2;

    private final void myPrivateMethod() {
        // 编译错误: 私有方法不能是最终的
    }
    // 编译错误: 私有属性不能是最终的
}