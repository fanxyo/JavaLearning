package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  18:52
 * @Description: TODO 掌握循环嵌套的执行流程
 * @Version: 1.0
 */
public class LoopNestedDemo7 {
    public static void main(String[] args) {
        // 循环嵌套的特点：外部循环每执行一次，内部循环会全部执行完一轮
        // 场景：某人罚你说我爱你3天，每天说5句
        for (int i = 1; i <= 3; i++) {
            // i = 1 2 3
            for (int j = 1; j <= 5; j++) {
                System.out.println("我爱你" + i);
            }
            System.out.println("-------------------");
        }

        // 打印
        /*
            ****
            ****
            ****
         */
        for (int i = 1; i <= 3; i++) {

            // 定义一个循环控制每行打印几个*
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println(); // 换行
        }
    }
}
