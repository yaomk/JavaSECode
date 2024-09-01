package com.atguigu07._abstract.exer2;

/**
 * ClassName: MyDate
 * Description:
 * private成员变量year、month、day
 * 提供必要的构造器
 * toDateString() 方法返回日期对应的字符串：YYYY年MM月DD日
 *
 * @Author yao
 * @Create 2024/9/1 11:38
 * @Version 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}
