package com.atguigu07.object;

/**
 * ClassName: CloneTest
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 23:10
 * @Version 1.0
 */
public class CloneTest {
    public static void main(String[] args) {
        Animal a1 = new Animal("花花");
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("原始对象：" + a1);
            System.out.println("a1[name=" + a1.getName() + "]");
            a2.setName("毛毛");
            System.out.println("clone之后的对象：" + a2);
            System.out.println("a2[name=" + a2.getName() + "]");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Animal implements Cloneable {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

