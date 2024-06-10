package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: Book
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午10:55
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showInfo() {
        return "BookName: " + bookName + " Author: " + author + " Price: " + price;
    }
}
