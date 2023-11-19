package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  13:03
 * @Description: TODO for循环
 * 控制一段代码执行多次，减少代码重复编写，灵活控制程序执行
 * @Version: 1.0
 */
public class ForDemo1 {
    public static void main(String[] args) {
        // 掌握for循环的书写格式，并理解其执行流程
        // for(初始化语句;循环条件;迭代语句){循环语句;}
        // 打印多行Hello World
        /**
         * 流程：
         * 首先执行初始化语句： int i = 0;
         * i = 0,判断循环条件 0 < 3,返回true,计算机进入循环中执行第一行Hello World,接着执行迭代语句i++
         * i = 1,判断循环条件 1 < 3,返回true,计算机进入循环中执行第二行Hello World,接着执行迭代语句i++
         * i = 2,判断循环条件 2 < 3,返回true,计算机进入循环中执行第三行Hello World,接着执行迭代语句i++
         * i = 3,判断循环条件 3 < 3,返回false,循环立即结束
         */
        for (int i = 0; i < 3; i++){
            // i = 0 1 2
            System.out.println("Hello World");
        }

        System.out.println("--------------------------");
        for (int i = 1; i <= 5; i++){
            // i = 1 2 3 4 5
            System.out.println("Hello World!");
        }

        System.out.println("--------------------------");
        for (int i = 1; i <= 10; i+=2){
            // i = 1 3 5 7 9
            System.out.println("Hello World!!");
        }
    }
}
