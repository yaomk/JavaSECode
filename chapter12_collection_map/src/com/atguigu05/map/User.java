package com.atguigu05.map;

import java.util.Objects;

/**
 * ClassName: User
 * Description:
 *
 * @Author yao
 * @Create 2026/5/4 10:18
 * @Version 1.0
 */
public class User implements Comparable {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getAge() == user.getAge() && Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 按照年龄从小到大排序
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof User) {
            User user = (User) o;
            return this.getAge() - user.getAge();
        }
        throw new RuntimeException("类型不匹配");
    }

    /**
     * 先比较年龄从小到大排列，如果年龄相同，则继续比较姓名，从大到小
     * @param o the object to be compared.
     * @return
     */
    // @Override
    // public int compareTo(Object o) {
    //     if( this == o) {
    //         return 0;
    //     }
    //     if(getClass() == o.getClass()) {
    //         User user = (User) o;
    //         int value = this.age - user.age;
    //         if(value != 0) {
    //             return value;
    //         }
    //         return  -this.name.compareTo(user.name);
    //     }
    //     throw new RuntimeException("类型不匹配");
    // }
}
