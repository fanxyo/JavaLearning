package com.fanxy.branch;

import java.util.Scanner;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.branch
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  12:15
 * @Description: TODO if分支--值匹配，区间匹配
 * 性能；值匹配时，switch性能更好
 * @Version: 1.0
 */
public class IfDemo1 {
    public static void main(String[] args) {
        // 掌握if分支三种形式的用法和执行流程
        // 1.测试体温
        double t = 36;
        if(t > 37.3){
            System.out.println("温度异常，带走！");
        }

        // 2.发红包，余额99元，现在要发出90元
        // 钱够触发发红包操作，不够则提醒余额不足
        double money = 19;
        if (money >= 90){
            System.out.println("成功发送红包");
        }else {
            System.out.println("余额不足");
        }

        // 3.一个公司的绩效系统，根据员工的打分输出对应的绩效级别
        // [0,60) D [60,80) C [80,90) B [90,100) A
        System.out.println("输入成绩：");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if (score>=0 && score<60){
            System.out.println("您的绩效级别是：D");
        }else if (score >= 60 && score < 80){
            System.out.println("您的绩效级别是：C");
        }else if (score >= 80 && score < 90) {
            System.out.println("您的绩效级别是：B");
        }else if (score >= 90 && score <= 100) {
            System.out.println("您的绩效级别是：A");
        }else {
            System.out.println("输入错误！");
        }
    }
}
