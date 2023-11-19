package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  13:48
 * @Description: TODO
 * @Version: 1.0
 */
public class WhileTest1 {
    public static void main(String[] args) {
        // 使用while循环解决问题，理解什么时候使用while、for
        // 1.定义变量存储珠穆朗玛峰的高度和纸张的厚度
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        // 3.定义一个变量count用于记住纸张折叠了多少次
        int count = 0;
        // 2.定义while循环控制纸张折叠
        while (paperThickness < peakHeight) {
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println("需要折叠：" + count + "次");
        System.out.println("最终纸张的厚度：" + paperThickness);

        for (int i = 0; paperThickness<peakHeight; i++) {
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println("需要折叠：" + count + "次");

    }
}
