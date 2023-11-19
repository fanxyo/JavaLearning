package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  18:23
 * @Description: TODO do-while循环的书写格式、执行流程、特点和应用场景
 * @Version: 1.0
 */
public class DoWhileDemo5 {
    public static void main(String[] args) {
        /*  格式：
            初始化语句；
            do{
                循环体语句;
                迭代语句;
            }while(循环条件);
         */
        // 打印多行Hello World
        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        }while (i < 3);

        // 特点：先执行，后判断
        do {
            System.out.println("Hello World2");
        }while (false);

        // 应用场景：抢票

        /*
            三种循环的区别：
            1、for循环和while循环先判断后执行，do-while循环先执行后判断
            2、for循环和while循环的执行流程是一样的功能上没有区别，for能做的while也能做，反之亦然
            3、使用规范：如果已知循环次数建议使用for循环，不清楚使用while循环
            4、其他区别：for循环中，控制循环的变量只能在循环中使用，while循环中，控制循环的变量在循环之后还可以继续使用
         */

        System.out.println("------------------");
        for (int j = 0; j < 3; j++) {
            System.out.println("Hello World3");
        }
//        System.out.println(j);
        for (int j = 0; j < 3; j++) {
            System.out.println("Hello World3");
        }

        int m = 0;
        while (m < 3){
            System.out.println("Hello World4");
            m++;
        }
        System.out.println(m);
    }
}
