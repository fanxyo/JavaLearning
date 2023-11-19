package com.fanxy.scanner;

import java.util.Scanner;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.scanner
 * @Author: fanxingyu
 * @CreateTime: 2023-11-17  11:16
 * @Description: TODO 使用Scanner接受用户键盘输入的数据
 * @Version: 1.0
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        // 前言：API(Application Programming Interface)文档
        // Java写好的程序，可以直接调用

        // 1.导包
        // 2.抄写代码：创建一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);
        // 3.开始使用sc的功能，来接受用户输入的数据
        System.out.println("请输入您的姓名：");
        String name=sc.next(); // 等待用户输入，直到用户按了回车键才会拿到数据
        System.out.println("您的姓名为：" + name);

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您的年龄为：" + age);
    }
}
