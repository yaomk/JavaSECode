package com.atguigu11.annotation;

import java.util.Date;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/6 09:45
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.eat();

        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(2024, 9, 6);
        System.out.println(date1);

        @SuppressWarnings("unused")
        Person p1 = new Person("Tom");
        System.out.println(p1);

        @SuppressWarnings({"unused"})
        int num = 10;
    }
}

@MyAnnotation(value = "class")
class Person {
    String name;
    int age;

    @MyAnnotation
    public Person() {
    }

    @Deprecated
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }
}