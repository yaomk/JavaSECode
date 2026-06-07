package com.atguigu02.selfdefine;

/**
 * ClassName: SubOrder
 * Description:
 *
 * @Author yao
 * @Create 2026/6/7 10:18
 * @Version 1.0
 */
public class SubOrder extends Order<Integer> {
}

class SubOrder1 extends Order {
    // 不是泛型类
    public void test() {
        Object t = getT();
        System.out.println(t);
    }
}

class SubOrder2 extends Order<Integer> {
    // 不是泛型类
    public void test() {
        Integer t = getT();
        System.out.println(t);
    }
}


class SubOrder3<T> extends Order<Integer> {
    // 是泛型类
    public T test(T arg) {
        Integer t = getT();
        System.out.println(t);
        return arg;
    }
}


class SubOrder4<T, E> extends Order<T> {
    // 是泛型类
    E e;

    public SubOrder4() {
    }

    public SubOrder4(T t, int orderId, E e) {
        super(t, orderId);
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public T test(T arg) {
        T t = getT();
        System.out.println(t);
        E e1 = getE();
        System.out.println(e1);
        return arg;
    }
}