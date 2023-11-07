package com.fanxy.constructorDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.constructorDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  10:02
 * @Description: TODO
 * @Version: 1.0
 */
public class SubClass1 extends SuperClass{
    private int n;

    SubClass1(){ //自动调用父类的无参构造方法
        System.out.println("SubClass");
    }
    public SubClass1(int n){
        super(300);    //调用父类中带有参数的构造器
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}
