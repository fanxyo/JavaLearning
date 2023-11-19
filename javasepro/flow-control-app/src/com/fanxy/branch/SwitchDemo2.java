package com.fanxy.branch;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.branch
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  12:46
 * @Description: TODO switch使用注意事项
 * @Version: 1.0
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        // 1.表达式类型只能是byte、short、int、char,JDK5开始支持枚举
        // JDK7开始支持String，不支持double、float、long
        int a=10;
        double b = 12.3;
        double b2 = 9.8;
        double c = b+b2;
        System.out.println(c);
        switch(a){

        }

        // 2.case给出的值不允许重复，只能是字面量，不能是变量
        // 3.正常使用switch时，不要忘记写break，否则会出现穿透现象
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "周三":
                System.out.println("今晚啤酒、烧烤、小龙虾");
            case "周四":
                System.out.println("解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
            case "周六":
                System.out.println("我要躺平");
                break;
            case "周日":
                System.out.println("准备上班");
                break;
            default:
                System.out.println("输入星期不存在");
        }
    }
}
