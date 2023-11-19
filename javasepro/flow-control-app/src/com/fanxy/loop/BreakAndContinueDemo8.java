package com.fanxy.loop;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.loop
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  19:04
 * @Description: TODO break和continue的作用
 * @Version: 1.0
 */
public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        // 1、break：跳出并结束当前所在循环的执行
        // 场景：某人罚你说5句我爱你，说到第3句心软了，让你别说了
        for (int i = 1; i <= 5; i++) {
            System.out.println("我爱你：" + i);
            if (i == 3){
                break;
            }
        }

        // 2、continue：跳出当前循环的当次执行，直接进入循环的下一次执行
        // 罚你洗碗5天，第三天心情好，不用洗碗，但是第四天还要继续
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("洗碗：" + i);
        }

        // 注意：break只能用于结束所在循环，或者结束switch分支的执行
        // continue只能在循环中进行使用
        if (3 < 9){
//            break;  // 不可以在分支
//            continue;
            System.out.println("Hello");
        }

    }
}
