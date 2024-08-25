package com.atguigu05.field.exer;

/**
 * ClassName: LeafTest
 * Description: 由父及子，静态先行
 *
 * @Author yao
 * @Create 2024/8/25 11:34
 * @Version 1.0
 */
public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
    }
}

class Root {
    static {
        System.out.println("Root 的静态初始化块");
    }

    {
        System.out.println("Root 的普通初始化块");
    }

    public Root() {
        System.out.println("Root 的无参构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid 的静态初始化块");
    }

    {
        System.out.println("Mid 的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid 的无参构造器");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid 带参构造器，参数为：" + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf 的静态初始化块");
    }

    {
        System.out.println("Leaf 的普通初始化块");
    }

    public Leaf() {
        super("Leaf super()");
        System.out.println("Leaf 的构造器");
    }
}
