package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  13:39
 * @Description: TODO while循环书写格式及执行流程
 * @Version: 1.0
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        //知道循环次数使用for,不知道循环次数使用while
        /*
            初始化语句;
            while(循环条件){
                循环体语句(被重复执行的代码);
                迭代语句;
            }
         */

        // 打印多行Hello World
        int i = 0;
        while (i < 5){
            // i = 0 1 2 3 4
            System.out.println("Hello World");
            i++;
        }
    }
}
