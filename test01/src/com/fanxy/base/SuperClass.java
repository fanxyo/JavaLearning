package com.fanxy.base;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.base
 * @Author: fanxingyu
 * @CreateTime: 2023-11-02  18:35
 * @Description: TODO
 * @Version: 1.0
 */
public abstract class SuperClass {
    abstract void m();//抽象方法
}

class SubClass extends SuperClass{
    //实现抽象方法
    void m(){
        //....
    }
}
