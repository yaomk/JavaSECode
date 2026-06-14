package com.atguigu03.more;

import java.util.Objects;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2026/6/14 10:52
 * @Version 1.0
 */
public class Person<T> {
    private String name;
    private T gender;

    public Person() {
    }

    public Person(String name, T gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person<?> person)) return false;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
