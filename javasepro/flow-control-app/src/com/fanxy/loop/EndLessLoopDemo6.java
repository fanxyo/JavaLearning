package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  18:44
 * @Description: TODO 死循环的写法
 * @Version: 1.0
 */
public class EndLessLoopDemo6 {
    public static void main(String[] args) {
        // 死循环：可以一直执行下去的一种循环，如果没有干预不会停下来
        // 应用场景：服务器程序：接受用户消息
//        for (int i = 0; ; i++) {
//            System.out.println("Hello World");
//        }

//        while (true){
//            System.out.println("Hello World2");
//        }

        do {
            System.out.println("Hello World3");
        }while (true);
    }
}
