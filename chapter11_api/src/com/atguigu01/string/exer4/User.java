package com.atguigu01.string.exer4;

/**
 * ClassName: User
 * Description:
 * 定义用户类，属性为用户名和密码，提供相关的 getter 和 setter 方法，构造器，toString()
 *
 * @Author yao
 * @Create 2025/8/30 11:36
 * @Version 1.0
 */
public class User {
    // 用户
    private String name;
    // 密码
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.password;
    }
}
