package com.fanxy.classDemo;

import java.util.regex.Pattern;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-05  12:23
 * @Description: TODO 正则表达式
 * @Version: 1.0
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        //判断字符串是否包含指定子字符串
        String content = "I am LiMing" + "from China.";
        String pattern = ".*LiMing.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'LiMing'子字符串？" + isMatch);
    }
}
