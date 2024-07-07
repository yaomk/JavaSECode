package com.atguigu05._super;

/**
 * ClassName: Student
 * Description:
 *
 * @Author yao
 * @Create 2024/7/6 上午9:26
 * @Version 1.0
 */
public class Student extends Person {

    String school;
    String id = "Student 类中的 id 属性"; // 声明了与父类同名的属性，要避免这种情况

    public Student() {
        super();
        //this(12, "TOm"); //构造器首行super()与this()只能选一个
        System.out.println("Student()...");
    }
    public Student(int age, String name) {
        super(name, age);
        //setAge(age);
        //super.name = name;
    }

    public void study() {
        System.out.println("学生要学习");
    }
    public void show1() {
        System.out.println("age: " + getAge());
    }
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }
    public void sleep() {
        super.sleep(); // 使用super调用父类的sleep()方法
        System.out.println("学生应该保证充足的睡眠");
    }

    public void show() {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void testSameField() {
        System.out.println("******** testSameField ********");
        System.out.println(id); //省略了this
        System.out.println(this.id);
        System.out.println(super.id);
    }
}
