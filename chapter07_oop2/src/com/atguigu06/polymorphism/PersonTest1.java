package com.atguigu06.polymorphism;

/**
 * ClassName: PersonTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 上午10:43
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
        p1.eat();
        // 不能直接调用子类特有的结构
        //p1.work();
        //System.out.println(p1.isSmoking);

        //向下转型：使用强转符。
        Man m1 = (Man) p1;
        m1.work();
        System.out.println(m1.isSmoking);
        System.out.println(p1);
        System.out.println(m1);
        // p1 和 m1 指向堆空间中的同一个对象
        System.out.println("p1 == m1 :" + (p1 == m1)); // true

        /*
        向下转型可能会出现：类型转换异常（Exception in thread "main" java.lang.ClassCastException）
         */
        Person p2 = new Woman();
        //Man m2 = (Man)p2;
        //m2.work();
        //System.out.println(m2.isSmoking);

        /*
        建议在向下转型之前，使用 instanceof 进行判断，避免出现类型转换异常
        格式：a instanceof A : 判断 对象a 是否为 类A 的实例
         */
        if (p2 instanceof Man) {
            Man m3 = (Man) p2;
            m3.work();
        } else {
            System.out.println("p2 instanceof Man :" + false);
        }
        if (p2 instanceof Woman) {
            System.out.println("Woman");
        }
        if (p2 instanceof Person) {
            System.out.println("Woman");
        }
        if (p2 instanceof Object) {
            System.out.println("Woman");
        }
    }
}
