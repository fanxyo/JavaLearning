package com.fanxy.memory;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.memory
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  21:23
 * @Description: TODO
 * @Version: 1.0
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 掌握普通变量、数组在计算机中的执行原理，Java程序在计算机中的执行过程
        int a = 10; // a是变量，直接放在栈中，存储的数据就是10这个值
        System.out.println(a);

        int[] arr0 = new int[3];
        // new int[3]是创建一个对象，会在堆内存中开辟存储3个整数
        // arr0 是变量，在栈中，arr0中存储的是数组对象在堆内存中的地址值

        int[] arr = new int[]{11,22,33};
        System.out.println(arr);

        System.out.println(arr[1]);
        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // java 内存分配：方法区、栈、堆、本地方法栈、程序计数器
        // 方法区：字节码文件（.class文件）首先加载到方法区
        // 栈内存：方法运行时所进入的内存，变量也是在这里，加载main()方法
        // 堆内存：new 出来的对象会在堆内存中开辟空间并产生地址



    }
}
