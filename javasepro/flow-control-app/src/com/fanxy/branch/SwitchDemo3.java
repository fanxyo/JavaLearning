package com.fanxy.branch;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.branch
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  12:56
 * @Description: TODO
 * @Version: 1.0
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        // 理解switch穿透性的作用
        // 存在多个case分支的代码一样时，可以把代码写到一个case块
        // 其他case块通过穿透性能，穿透到该case块即可，这样可以简化代码
        String week = "周六";
        switch (week){
            case "周一":
            case "周二":
            case "周三":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周四":
            case "周五":
                System.out.println("解决bug");
                break;
            case "周六":
            case "周日":
                System.out.println("我要躺平");
                break;
            default:
                System.out.println("输入星期不存在");
        }
    }
}
