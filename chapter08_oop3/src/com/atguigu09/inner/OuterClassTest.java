package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/4 09:52
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        // 1. 创建 Person 的静态的成员内部类的实例
        Person.Dog dog = new Person.Dog();
        dog.eat();

        // 2. 创建 Person 的非静态的成员内部类的实例
        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.eat();
        bird.show("珠颈斑鸠");
        bird.show1();
    }
}

class Person {// 外部类
    String name = "Tom";
    int age = 18;

    {
        // 局部内部类
        class InnerClass {
        }
    }

    public Person() {
        // 局部内部类
        class InnerClass {
        }
    }

    public void eat() {
        System.out.println("person.eat()");
    }

    public void method() {
        // 局部内部类
        class InnerClass {
        }
    }

    // 静态的成员内部类
    static class Dog {
        public void eat() {
            System.out.println("狗吃骨头");
        }
    }

    // 非静态的成员内部类
    class Bird {
        String name = "啄木鸟";

        public void eat() {
            System.out.println("鸟吃虫子");
        }

        public void show(String name) {
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("bird.name = " + this.name);
            System.out.println("person.name = " + Person.this.name);
        }

        public void show1() {
            eat(); // 相当于 this.eat();
            Person.this.eat();
        }
    }

}