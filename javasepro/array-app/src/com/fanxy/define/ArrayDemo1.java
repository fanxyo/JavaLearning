package com.fanxy.define;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.define
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  20:06
 * @Description: TODO 数组定义
 * @Version: 1.0
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 目标： 掌握数组的定义方式一：静态初始化数组

        // 1.完整格式：
        // 数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3......}
        int[] ages = new int[]{12,18,16};
        double[] score = new double[]{66, 94.3, 59.5, 88};
        System.out.println(ages);   // 打印数组地址：[I@14ae5a5
        System.out.println(score);  // [D@7f31245a

        // 2.简化格式：
        // 数据类型[] 数组名 = {元素1, 元素2, 元素3......}
        int[] ages2 = {12,18,16};
        double[] score2 = {66, 94.3, 59.5, 88};

        // 3.数据类型 数组名[]
        int ages3[] = {12,18,16};
        double score3[] = {66, 94.3, 59.5, 88};

        // 注意：数组元素类型必须一致
        // 数组在计算机中的执行原理
        // 数组变量名中存储的是数组在内存中的地址信息，数组是一种引用数据类型
    }
}
