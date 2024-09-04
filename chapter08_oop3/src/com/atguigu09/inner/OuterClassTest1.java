package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/9/4 10:13
 * @Version 1.0
 */
public class OuterClassTest1 {
    // 局部内部类的使用
    public void method1() {
        class A {

        }
    }

    // 开发中的场景
    public Comparable getInstance() {
        // 提供了实现了 Comparable 接口的类
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        // 方式：提供了接口的实现类的对象
        Comparable a = new MyComparable();
        //return a;

        // 方式2：提供了接口的实现类的匿名对象
        //return new MyComparable();

        // 方式3：提供了接口的匿名实现类的对象
        Comparable b = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        //return b;

        // 方式4：提供了接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}


