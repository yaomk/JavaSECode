package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/6/1 下午5:14
 * @Version 1.0
 */
public class ValueTransferTest1 {
    int test;
    public static void main(String[] args) {
        //1.对于基本数据类型的变量来说
        int m = 10;
        ValueTransferTest1 test = new ValueTransferTest1();
        test.method1(m);
        System.out.println("m = " + m);

        //2.对于引用数据类型的变量来说
        Person p = new Person();
        p.age = 10;
        test.method2(p);
        System.out.println(p.age);

        test.test = 2;
        test.method3(test);
        System.out.println(test.test);
    }
    public void method1(int m) {
        m++;
    }
    public void method2(Person p) {
        p.age++;
    }
    public void method3(ValueTransferTest1 m) {
        m.test++;
    }
}

class Person {
    int age;
}