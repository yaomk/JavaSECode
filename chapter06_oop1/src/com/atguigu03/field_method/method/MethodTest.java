package com.atguigu03.field_method.method;

/**
 * ClassName: MethodTest
 * Description:
 *
 * @Author yao
 * @Create 2024/5/19 上午11:33
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 20;
        p1.gender = '男';
        p1.eat();
        System.out.println(p1.getAge());
    }
}

class Person{
    String name;
    int age;
    char gender;

    public void eat() {
        System.out.println(name + "在吃饭");
        sleep(8);
    }
    public void sleep(int hour) {
        System.out.println("人至少每天睡眠" + hour + "小时");
    }
    public String interests(String hobby) {
        String info = "爱好是" + hobby;
        System.out.println(info);
        return info;
    }
    public int getAge() {
        return age;
    }
    public void info() {
        System.out.println("public void info()");
        //info();
        //方法内不能定义方法！
        //public void show() {}
    }
}
