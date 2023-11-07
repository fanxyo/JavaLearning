package com.fanxy.enumDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.enumDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  20:26
 * @Description: TODO Enum类的values(),ordinal()和valueOf()方法
 * @Version: 1.0
 */
public class EnumMethod {
    enum Color{
        RED,GREEN,BLUE;
    }

    public static void main(String[] args) {
        // 调用values()返回枚举类中所有的值
        Color[] arr = Color.values();

        // 迭代枚举，ordinal()方法找到每个枚举常量的索引
        for (Color color : arr) {
            //查看索引
            System.out.println(color + " at index " + color.ordinal());
        }

        // 使用valueOf()返回指定字符串值的枚举常量，不存在的报错IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
    }
}
