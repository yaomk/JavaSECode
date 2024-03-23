package com.atguigu1.one;

/**
 * ClassName: OneArrayTest1
 * Description:
 *
 * @Author yao
 * @Create 2024/3/23 16:14
 * @Version 1.0
 */
public class OneArrayTest1 {
    public static void main(String[] args){
        // 数组元素的默认初始值

        // 整形数组元素的默认初始化值：0
        int[] arr1 = new int[3];
        System.out.println("arr1[0] = " + arr1[0]);

        short[] arr2 = new short[3];
        System.out.println("arr2 = " + arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

        // 浮点型数组元素的默认初始化值：0.0
        double[] arr3 = new double[3];
        System.out.println("arr3 = " + arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }

        // 字符型数组元素的默认初始化值：0 (或者理解为‘\u0000’)
        char[] arr4 = new char[3];
        System.out.println("arr4 = " + arr4);
        System.out.println("arr4[0] = " + arr4[0]);

        if(arr4[0] == 0) {
            System.out.println("1111");
        }
        if(arr4[0] == '0') {
            System.out.println("2222");
        }
        if(arr4[0] == '\u0000') {
            System.out.println("3333");
        }

        // boolean型数组元素的默认初始化值：false
        boolean[] arr5 = new boolean[3];
        System.out.println("arr5 = " + arr5);
        System.out.println("arr5[0] = " + arr5[0]);

        // 引用数据类型数组元素的默认初始化值：null
        String[] arr6 = new String[3];
        System.out.println("arr6 = " + arr6);
        for (int i = 0; i < arr6.length; i++) {
            System.out.println("arr6[" + i + "] = " + arr6[i]);
        }

        if(arr6[0] == null) {
            System.out.println("aaaa");
        }
        if(arr6[0] == "null") {
            System.out.println("bbbb");
        }

        // 数组的内存解析
        int[] a1 = new int[]{1,2,3};
        int[] a2 = a1;
        a2[1] = 10;
        System.out.println("a1[1] = " + a1[1]); // 10
        System.out.println("a1 = " + a1); // [I@1d81eb93
        System.out.println("a2 = " + a2); // [I@1d81eb93
    }
}
