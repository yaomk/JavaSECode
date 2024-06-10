package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/10 上午10:59
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookName("剑指java");
        book1.setAuthor("尚硅谷");
        book1.setPrice(180.0);
        System.out.println(book1.showInfo());
    }
}
