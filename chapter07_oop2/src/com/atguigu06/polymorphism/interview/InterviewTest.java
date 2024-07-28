package com.atguigu06.polymorphism.interview;

import java.util.Random;

/**
 * ClassName: InterviewTest
 * Description:
 * 面试题：多态是编译时还是运行时行为？
 * 运行时行为。
 *
 * @Author yao
 * @Create 2024/7/28 下午12:23
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        int key = new Random().nextInt(3);
        System.out.println(key);
        Animal animal = getInstance(key);
        animal.eat();
    }

    public static Animal getInstance(int key) {
        return switch (key) {
            case 0 -> new Cat();
            case 1 -> new Dog();
            case 2 -> new Sheep();
            default -> new Animal();
        };
    }
}

class Animal {
    protected void eat() {
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal {
    @Override
    protected void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal {
    @Override
    protected void eat() {
        System.out.println("狗吃骨头");
    }
}

class Sheep extends Animal {
    @Override
    protected void eat() {
        System.out.println("羊吃草");
    }
}