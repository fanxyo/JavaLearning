package com.fanxy.constructorDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.constructorDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  09:59
 * @Description: TODO 构造器
 * @Version: 1.0
 */
public class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n):"+n);
        this.n = n;
    }
}
