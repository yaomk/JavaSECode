package com.atguigu06.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/21 上午10:51
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest at = new AnimalTest();
        at.adopt(new Animal());
        at.adopt(new Dog());
        at.adopt(new Cat()); // Animal animal = new Cat();
    }

    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
        //animal.watchDoor();
        //animal.catchMouse();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchDoor();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

    public void adopt(Dog dog) {
        dog.eat();
        dog.jump();
        dog.watchDoor();
    }
}

class Animal {
    public void eat() {
        System.out.println("动物进食");
    }

    public void jump() {
        System.out.println("动物跳");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗急跳墙");
    }

    public void watchDoor() {
        System.out.println("狗看门");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫跳");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}