package com.fanxy.define;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.define
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  20:46
 * @Description: TODO 数组定义方式二-动态初始化数组,数组元素默认值
 * @Version: 1.0
 */
public class ArrayDemo5 {
    public static void main(String[] args) {
//        动态初始化数组
//        定义数组时先不存入具体的值，只确定数组存储的数据类型和数组的长
        // 注意：静态初始化和动态初始化写法是独立的，不可以混用
        // int[] arr = new int[3]{1,2,3};
//        1.数据类型[] 数组名 = new 数据类型[长度];
        int[] ages = new int[3];
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0] = 12;
        ages[1] = 14;
        ages[2] = 16;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println("----------------------");
        // 动态初始化数组元素默认值
        // 基本类型：byte、short、char、int、long 默认值：0
        char[] ch = new char[3];
        System.out.println((int)ch[0]); // 0
        System.out.println((int)ch[2]);

        // float、double 动态初始化数组元素默认值：0.0
        double[] scores = new double[80];
        System.out.println(scores[0]);  // 0.0
        System.out.println(scores[79]);

        // boolean 动态初始化数组元素默认值：false
        boolean[] flags = new boolean[100];
        System.out.println(flags[0]);   // false
        System.out.println(flags[99]);

        // 引用数据类型 动态初始化数组元素默认值：null
        String[] names = new String[66];
        System.out.println(names[0]);   // null
        System.out.println(names[65]);
    }
}
