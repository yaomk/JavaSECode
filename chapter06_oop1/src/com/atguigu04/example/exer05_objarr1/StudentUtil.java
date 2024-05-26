package com.atguigu04.example.exer05_objarr1;

/**
 * ClassName: StudentUtil
 * Description:
 *
 * @Author yao
 * @Create 2024/5/26 上午11:51
 * @Version 1.0
 */
public class StudentUtil {
    /**
     * 打印指定年级的学生信息
     */
    public void printStudentsWithIndex(Student[] students, int state) {
        for(int i = 0; i < students.length; i++) {
            if(students[i].state == state){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }

    /**
     * 遍历执行的学生数组
     * @param students Student[]
     */
    public void printStudents(Student[] students) {
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

    /**
     * 针对学生数组，按照成绩属性从低到高排序
     * @param students Student[]
     */
    public void sortStudentsByBubble(Student[] students) {
        for(int i = 0; i < students.length - 1; i++) {
            for(int j = 0; j < students.length - 1 - i; j++) {
                if(students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 反转学生数组
     * @param arr
     */
    public void reverseStudents(Student[] arr) {
        for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
            Student temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
    public void sortStudentsByQuick(Student[] arr, int left, int right) {
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
        sortStudentsByQuick(arr, left, r - 1);
        sortStudentsByQuick(arr, l + 1, right);
    }
}
