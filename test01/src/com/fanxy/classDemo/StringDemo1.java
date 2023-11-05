package com.fanxy.classDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-04  19:06
 * @Description: TODO String类
 * @Version: 1.0
 */
public class StringDemo1 {

    public static void main(String[] args) {
        //String对象一旦创建，无法改变
        char[] helloArray = {'h', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        //获取字符串长度
        String site = "www.github.com";
        int len = site.length();
        System.out.println("github网址长度：" + len);

        //连接字符串
        String string1 = "github网址：";
        System.out.println("1、" + string1 + "www.github.com");

        //输出格式化字符串
        //printf()方法输出字符串
        System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                "%d, 字符串变量的值为 " +
                "%s", 10.3, 10, "fff");
        //format()创建可复用的格式化字符串
        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                "%d, 字符串变量的值为 " +
                "%s", 10.3, 10, "fff");
        System.out.println();
        System.out.println(fs);

    }
}




