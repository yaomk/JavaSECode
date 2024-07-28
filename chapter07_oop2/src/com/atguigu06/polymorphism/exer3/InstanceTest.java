package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 上午11:45
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest ins = new InstanceTest();
        ins.method(new Graduate());
        System.out.println();
        ins.method(new Student());
        System.out.println();
        ins.method(new Person());

    }

    public void method(Person e) {
        System.out.println(e.getInfo());
       /* if(e instanceof Graduate) {
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        } else if(e instanceof Student) {
            System.out.println("a student");
            System.out.println("a person");
        } else {
            System.out.println("a person");
        }*/
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
        if (e instanceof Student) {
            System.out.println("a student");
        }
        System.out.println("a person");
    }
}
