package com.atguigu04.block.exer1;

/**
 * ClassName: User
 * Description:
 *
 * @Author yao
 * @Create 2024/8/25 10:32
 * @Version 1.0
 */
public class User {
    private final long registrationTime; // 注册时间
    private String userName;
    private String password;

    public User() {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis(); // 获取系统的当前时间（时间戳，毫秒）
        userName = registrationTime + "";
        password = "123456";
    }

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getInfo() {
        return "用户名：" + userName + ", 密码：" + password + ", 创建时间：" + registrationTime;
    }
}
