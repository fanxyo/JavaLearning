package com.fanxy.base;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.base
 * @Author: fanxingyu
 * @CreateTime: 2023-11-02  17:53
 * @Description: TODO
 * @Version: 1.0
 */
abstract class Caravan {
    //非访问修饰符
    //abstract修饰符
    private double price;
    private String model;
    private String year;
    public abstract void goFast();//抽象方法
    public abstract void changeColor();

}
