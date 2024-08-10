package com.atguigu07.object.equals.apply;

import java.util.Objects;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 12:46
 * @Version 1.0
 */
public class Customer {
    private String name;
    private int age;
    private Account act;

    public Customer(String name, int age, Account act) {
        this.name = name;
        this.age = age;
        this.act = act;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(act, customer.act);
    }

}
