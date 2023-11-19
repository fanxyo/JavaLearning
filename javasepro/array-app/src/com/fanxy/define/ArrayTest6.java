package com.fanxy.define;

import java.util.Scanner;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.define
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  21:08
 * @Description: TODO 数组案例-评委打分
 * @Version: 1.0
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        // 1.定义一个动初始化数组，负责存储6位评委的打分
        double[] scores = new double[6];

        Scanner sc = new Scanner(System.in);

//        // 2.遍历数组中的每个位置，录入评委的分数存入到数组中
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("请输入当前第 " + (i + 1) + " 个评委的分数：");
//            double score = sc.nextDouble();
//            scores[i] = score;
//        }
//
//        // 3.遍历数组中每个元素进行求和
//        double sum = 0;
//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        System.out.println("选手最终得分为：" + sum / scores.length);

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入当前第 " + (i + 1) + " 个评委的分数：");
            double score = sc.nextDouble();
            scores[i] = score;
            sum += scores[i];
        }
        System.out.println("选手最终得分为：" + sum / scores.length);
    }
}
