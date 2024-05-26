package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: StudentTest
 * Description:
 * 1.定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)
 * 2.创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印3年级的学生信息
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 生成随机数：Math.random()，返回值类型是double
 * 四舍五入取整：Math.round(double d)，返回值类型long
 * 获取 `[a, b]` 范围内的随机整数：`(int)(Math.random() * (b - a + 1)) + a`
 * 年级[1,6]
 * 成绩[0,100]
 *
 * @Author yao
 * @Create 2024/5/26 上午10:18
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建Student[]
        Student[] students = new Student[20]; // String[] strs = new String[20];
        // 使用循环，给数组的元素赋值
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();
            // 给每一个学生对象的number，state，score属性赋值
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }
        // 需求一：打印出3年级的学生信息
        for(int i = 0; i < students.length; i++) {
            if(students[i].state == 3){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
        System.out.println("**************");
        // 打印所有学生信息
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
        System.out.println("**************");

        // 需求二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i = 0; i < students.length - 1; i++) {
            for(int j = 0; j < students.length - 1 - i; j++) {
                if(students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        // 冒泡排序后
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
        System.out.println("**************");

        // 反转
        reverseStudents(students);
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
        System.out.println("**************");

        quickSort(students, 0, students.length - 1);
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }
    static void quickSort(Student[] arr, int left, int right) {
        if(left - right >= 0) return;
        int pivot = arr[left].score;
        int l = left;
        int r = right;
        while(l < r) {
            while(l < r && arr[r].score > pivot) r--;
            while(l < r && arr[l].score <= pivot) l++;
            Student temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        if(left != l) {
            Student temp = arr[l];
            arr[l] = arr[left];
            arr[left] = temp;
        }
        quickSort(arr, left, r - 1);
        quickSort(arr, l + 1, right);
    }
    static void reverseStudents(Student[] arr) {
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            Student temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
