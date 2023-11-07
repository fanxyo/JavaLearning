package com.fanxy.constructorDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.constructorDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  10:10
 * @Description: TODO
 * @Version: 1.0
 */
public class TestSuperSub {
    public static void main(String[] args) {
        System.out.println("-------SubClass 类继承--------");
        SubClass1 sc1 = new SubClass1();
        SubClass1 sc2 = new SubClass1(100);
        System.out.println("-------SubClass2 类继承-------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}
