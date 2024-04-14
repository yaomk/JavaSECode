package com.atguigu2.common_algorithm.exer3;

/**
 * ClassName: YangHuTest
 * Description:使用二维数组打印一个 10 行 杨辉三角
 * 提示：
 * 1. 第一行有 1 个元素，第 n 行 有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始，对于非第一个元素和最后一个元素的元素，即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 *
 * @Author yao
 * @Create 2024/4/14 上午11:24
 * @Version 1.0
 */
public class YangHuTest {
    public static void main(String[] args) {
        // 初始化二维数组
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            //初始化内层数组
            yanghui[i] = new int[i + 1];
            //杨辉三角第一个元素和最后一个元素赋值 1
            yanghui[i][0] = yanghui[i][i] = 1;
            System.out.print(yanghui[i][0]);
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                //对杨辉三角第二个元素 ~ 倒数第二个元素赋值
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                System.out.print("\t" + yanghui[i][j]);
            }
            if(i > 0) {
                System.out.print("\t" + yanghui[i][i]);
            }
            System.out.println();
        }
    }
}
