package com.atguigu01._this;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/23 上午11:34
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.age);
        Person p2 = new Person("Jack", 20);
        System.out.println(p2.getName());
        System.out.println(p2.getInfo());
    }
}

class Person {
    String name;
    int age;
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return this.name;
    }
    public String getInfo() {
        return "姓名：" + this.getName() + ", 年龄：" + this.getAge();
    }
}
