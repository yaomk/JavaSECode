package com.atguigu13.idea.debug;

/**
 * ClassName: Debug03Test
 * Description:
 *
 * @Author yao
 * @Create 2024/9/12 12:09
 * @Version 1.0
 */
public class Debug03Test {
    public static void main(String[] args) {
        Person p1 = new Person(3);
        System.out.println(p1);
    }
}

class Person {
    // 字段断点
    private int id = 1;
    private String name;

    {
        id = 2;
    }

    public Person() {
    }

    public Person(int id) {
        this.id = id;
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
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
