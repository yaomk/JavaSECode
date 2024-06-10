package com.atguigu06.package_import;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import java.lang.reflect.Field;
import java.util.*;
//import java.sql.Date;

// import java.lang.String; java.lang包不用导入
// import java.lang.System;

import static java.lang.System.out;
//调用指定类或接口下的静态的属性或方法
import static java.lang.Math.PI;

/**
 * ClassName: PackageImportTest
 * Description:
 *
 * @Author yao
 * @Create 2024/6/8 上午9:57
 * @Version 1.0
 */
public class PackageImportTest {
    public static void main(String[] args) {
        Scanner scannerIns = new Scanner(System.in);
        scannerIns.close();
        ArrayList list = new ArrayList();
        HashMap map = new HashMap();
        HashSet set = new HashSet();

        String str = "hello world!";
        System.out.println(str);

        Person p1 = new Person(); // 同一个包下，不用import

        Field field = null; // 如果已经导入java.a包下的类，那么如果需要使用a包的子包下的类的话，仍然需要导入

        // Date 可以使用import的方式指明 java.util.Date
        Date Date = null;
        // 使用全类名的方式指明 java.sql.Date
        java.sql.Date date1 = new java.sql.Date(12341234124L);

        out.println("hello");
        out.println(PI);
    }

}
