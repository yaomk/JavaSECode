package com.atguigu04.compare.comparable;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Description:
 *
 * @Author yao
 * @Create 2025/11/16 09:56
 * @Version 1.0
 */
public class ComparableTest {
    @Test
    public void test1() {
        String[] arr = new String[]{"Tom", "Jarry", "Tony", "Rose", "Jack",};
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }

    @Test
    public void test2() {
        Product[] arr = new Product[]{
                new Product("Mate 50 Pro", 6299),
                new Product("Xiaomi 13 Pro", 4999),
                new Product("Vivo X90 Pro", 5999),
                new Product("Iphone 14 Pro", 9999),
                new Product("HonorMagic 4", 6299),
        };
        Arrays.sort(arr);
        for (Product p : arr) {
            System.out.println(p);
        }
    }

    @Test
    public void test3() {
        Product p1 = new Product("Mate 50 Pro", 6299);
        Product p2 = new Product("HonorMagic 4", 6299);
        int compare = p1.compareTo(p2);
        if(compare < 0) {
            System.out.println("p1 < p2");
        } else if(compare > 0) {
            System.out.println("p1 > p2");
        } else {
            System.out.println("p1 == p2");
        }
        System.out.println(compare);
    }
}
