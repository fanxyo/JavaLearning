package com.fanxy.branchDemo;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.branchDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-11-03  09:19
 * @Description: TODO 分支结构
 * @Version: 1.0
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //char grade = args[0].charAt(0);
        char grade = 'B';
        switch (grade)
        {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'E':
                System.out.println("还需努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的成绩等级是：" + grade);
    }
}
