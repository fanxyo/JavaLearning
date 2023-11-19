package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  13:22
 * @Description: TODO for循环批量产生数据
 * @Version: 1.0
 */
public class ForDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        // 求1-100数据和
        int sum =0 ;
        for (int i = 1; i <= 100; i++) {
            sum+=i; //sum=sum+i;
        }
        System.out.println(sum);

        System.out.println("------------------");

        // 求1-100之间的奇数和
        // 定义一个变量用于累加奇数求和
        // 1.
        int sum1 = 0;
        for (int i = 1; i < 100; i+=2) {
            sum1+=i;
        }
        System.out.println(sum1);

        System.out.println("------------------");
        // 2.
        int sum2 = 0;
        // 定义一个循环，产生1-100之间的数据
        for (int i = 1; i <= 100; i++) {
            // 使用if分支，判断i是否是奇数，是奇数累加给一个变量
            if (i % 2 == 1) {
                sum2+=i;
            }
        }
        System.out.println(sum2);
    }
}
