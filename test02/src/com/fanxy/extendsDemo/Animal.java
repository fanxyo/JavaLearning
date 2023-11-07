package com.fanxy.extendsDemo;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.extendsDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-06  16:58
 * @Description: TODO java继承类
 * @Version: 1.0
 */
public class Animal {
    private String name;
    private int id;

    public Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是\t" + id + "号" + name);
    }
}
