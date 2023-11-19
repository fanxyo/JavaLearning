package com.fanxy.define;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.define
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  20:40
 * @Description: TODO 数组遍历-求和
 * @Version: 1.0
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        // 数组元素求和
        // 1.定义一个数组存储5名员工销售额
        int[] money = {45,56,77,22,100};

        // 3.定义一个变量用于累加求和
        int sum = 0;

        // 2.遍历这个数组中的每个数据
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("员工的销售总额：" + sum);
    }
}
