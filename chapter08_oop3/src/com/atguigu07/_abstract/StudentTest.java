package com.atguigu07._abstract;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author yao
 * @Create 2024/9/1 10:12
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        //Person p1 =new Person();
        Student stu = new Student("Tom", 12, "家里蹲");
        stu.sleep();
        stu.eat();
        stu.breath();

        Worker w1 = new Worker() {
            @Override
            public void breath() {
                System.out.println("工人呼吸");
            }
        };
        w1.breath();
        w1.eat();
    }
}
