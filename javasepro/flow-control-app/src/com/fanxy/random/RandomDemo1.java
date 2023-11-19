package com.fanxy.random;

import java.util.Random;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.random
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  19:23
 * @Description: TODO Random 生成随机数
 * @Version: 1.0
 */
public class RandomDemo1 {
    public static void main(String[] args) {
        // 1.导包
        // 2.创建一个Random对象，用于生成随机数
        Random r = new Random();
        // 3.调用Random提供的功能：nextInt得到随机数
        // 注意：nextInt(n)只能生成 0到n-1 之间的随机数，不包含n
        // 前闭后开区间，包前不包后
        for (int i = 0; i < 10; i++) {
            int data = r.nextInt(10);  // 0-9
            System.out.println(data);
        }

        System.out.println("---------------------");
        // 生成指定区间随机数   技巧：减加法
        // 1-10  ————> -1 ————>(0-9) + 1
        for (int i = 1; i <=20 ; i++) {
            int data = r.nextInt(10) +1;
            System.out.println(data);
        }

        System.out.println("------------");
        // 生成20个3-17之间的随机数
        // 3-17 ----> -3 --->(0-14) +3
        for (int i = 1; i <= 20; i++) {
            int data = r.nextInt(15) +3;
            System.out.println(data);
        }
    }
}
