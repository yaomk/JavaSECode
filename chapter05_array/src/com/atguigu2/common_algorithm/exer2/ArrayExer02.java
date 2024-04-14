package com.atguigu2.common_algorithm.exer2;

/**
 * ClassName: ArrayExer02
 * Description:
 * 1. 在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
 * 2. 求选手的最后得分（去掉一个最高分和一个最低分其余8位评委打分的平均值）
 *
 * @Author yao
 * @Create 2024/4/14 上午11:16
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = new int[]{5,4,6,8,9,0,1,2,7,3};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            max = Math.max(max, scores[i]);
            min = Math.min(min, scores[i]);
        }
        System.out.println("去掉一个最高分和一个最低分后，该选手的最后得分为：" + (sum - max - min) / 8);

    }
}
