package com.fanxy.override_overload;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.override
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  10:40
 * @Description: TODO
 * @Version: 1.0
 */
public class Dog extends Animal {
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

