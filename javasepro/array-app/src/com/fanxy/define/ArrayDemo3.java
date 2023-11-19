package com.fanxy.define;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.define
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  20:33
 * @Description: TODO 数组遍历
 * @Version: 1.0
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        // 遍历：一个一个数据的访问
        // 遍历数组用处：求和、元素搜索、找最值
        int[] ages = {12,24,36};

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

        for (int i = 0; i < 3; i++) {
            // i = 0 1 2
            System.out.println(ages[i]);
        }
        // ages.fori
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
