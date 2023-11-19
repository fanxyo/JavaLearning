package com.fanxy.branch;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.branch
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  12:34
 * @Description: TODO switch分支 --值匹配
 * @Version: 1.0
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        // 备忘录
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
                break;
            case "周四":
                System.out.println("解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
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
