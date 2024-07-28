package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Description:
 *
 * @Author yao
 * @Create 2024/7/28 上午11:48
 * @Version 1.0
 */
public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor: " + major;
    }
}
