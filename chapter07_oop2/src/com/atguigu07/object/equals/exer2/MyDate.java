package com.atguigu07.object.equals.exer2;

/**
 * ClassName: MyDate
 * Description:
 *
 * @Author yao
 * @Create 2024/8/10 13:11
 * @Version 1.0
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyDate myDate)) return false;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }
}
