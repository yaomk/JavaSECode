package com.atguigu04.set.interview;

import java.util.Objects;

/**
 * ClassName: Person
 * Description:
 *
 * @Author yao
 * @Create 2026/5/10 12:31
 * @Version 1.0
 */
public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person equals() invoked...");
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Person hashCode() invoked..." + id + "_" + name + " hashCode:" + Objects.hash(id, name));

        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
