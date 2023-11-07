package com.fanxy.enumDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.enumDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  20:17
 * @Description: TODO 内部枚举类测试
 * @Version: 1.0
 */
public class EnumTest02 {
    enum Color{
        RED,GREEN,BLUE;
    }

    public static void main(String[] args) {
        Color color =Color.GREEN;
        System.out.println(color);

        // 使用for语句迭代枚举元素
        for (Color myColor : Color.values()) {
            System.out.println(myColor);
        }

        // 在switch语句中使用枚举类
        Color myColor = Color.BLUE;
        switch (myColor){
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}
