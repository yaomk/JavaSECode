package com.atguigu04.compare.comparator;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Description:
 *
 * @Author yao
 * @Create 2025/11/16 11:54
 * @Version 1.0
 */
public class ComparatorTest {
    @Test
    public void test1() {
        Product[] arr = new Product[]{
                new Product("Mate 50 Pro", 6299),
                new Product("Xiaomi 13 Pro", 4999),
                new Product("Vivo X90 Pro", 5999),
                new Product("Iphone 14 Pro", 9999),
                new Product("HonorMagic 4", 6299),
        };
        // 创建一个实现了 Comparator 接口的实现类的对象
        Comparator comparator = new Comparator() {
            // 如何判断两个对象o1,o2的大小，其标准就是此方法的方法体要编写的逻辑
            // 比如：价格从高到底
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;
                    return -Double.compare(p1.getPrice(), p2.getPrice());
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        // 如何判断两个对象o1,o2的大小，其标准就是此方法的方法体要编写的逻辑
        // 比如：按照name从低到高
        Comparator comparator1 = (o1, o2) -> {
            if (o1 instanceof Product && o2 instanceof Product) {
                Product p1 = (Product) o1;
                Product p2 = (Product) o2;
                return p1.getName().compareTo(p2.getName());
            }
            throw new RuntimeException("类型不匹配");
        };
        Arrays.sort(arr, comparator);
        for (Product p : arr) {
            System.out.println(p);
        }
    }

    @Test
    public void test2() {
        String[] arr = new String[]{"Tom", "Jarry", "Tony", "Rose", "Jack"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return -((String) o1).compareTo(((String) o2));
                }
                throw new RuntimeException("类型不匹配");
            }

        });
        for (String s : arr) System.out.println(s);
    }
}
