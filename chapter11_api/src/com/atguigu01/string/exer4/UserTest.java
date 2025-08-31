package com.atguigu01.string.exer4;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author yao
 * @Create 2025/8/30 11:47
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        // 创建数组，并初始化几个 User 对象
        User[] arr = new User[3];
        arr[0] = new User("Jack", "123");
        arr[1] = new User("Tom", "888");
        arr[2] = new User("Jerry", "666");
        System.out.println("库中的用户有：");
        for (User user : arr) {
            System.out.println(user);
        }
        // 2.实例化SCanner，获取输入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();

        boolean isFlag = true;

        for(User user : arr){
            if(user.getName().equals(userName)) {
                if(user.getPassword().equals(password)){
                    System.out.println("登录成功！");
                } else {
                    System.out.println("密码错误，登陆失败！");
                }
                isFlag = false;
            }
        }
        if(isFlag) {
            System.out.println("用户未注册!");
        }

        sc.close();
    }
}
