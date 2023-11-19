package com.fanxy.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.random
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  19:48
 * @Description: TODO
 * @Version: 1.0
 */
public class RandomTest2 {
    public static void main(String[] args) {
        // 生成1-100之间的随机数，作为中奖号码
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        // 2.定义一个死循环，让用户不断输入猜测数据
        Scanner sc = new Scanner(System.in);
        while(true){
            // 提示用户猜测
            System.out.println("请输入您猜测的的数字：");
            int guessNumber = sc.nextInt();

            //判断用户猜测的数字与幸运号码的大小情况
            if (guessNumber > luckNumber){
                System.out.println("您猜测的数字过大~~");
            }else if (guessNumber < luckNumber){
                System.out.println("您猜测的数字过小~~");
            }else {
                System.out.println("恭喜您，猜对了");
                break; // 结束死循环，结束猜测
            }
        }
    }

}
