package com.fanxy.enumDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.enumDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  20:35
 * @Description: TODO 枚举类成员
 * @Version: 1.0
 */
public class EnumTest03 {
    enum Color{
        RED,GREEN,BLUE;

        // 枚举类的构造函数只能使用private访问修饰符
        private Color(){
            System.out.println("Constructor called for : " + this.toString());
        }

        public void colorInfo(){
            System.out.println("Universal Color");
        }
    }

    // 输出
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color);
        color.colorInfo();
    }

}
