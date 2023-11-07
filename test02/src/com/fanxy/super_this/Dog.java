package com.fanxy.super_this;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.super_this
 * @Author: fanxingyu
 * @CreateTime: 2023-11-06  20:05
 * @Description: TODO super、this关键字
 * @Version: 1.0
 */
public class Dog extends Animal{
    void eat(){
        System.out.println("dog : eat");
    }
    void eatTest(){
        this.eat();     //this 调用自己的方法
        super.eat();    //super 调用父类的方法
    }
}
