package com.fanxy.base;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.base
 * @Author: fanxingyu
 * @CreateTime: 2023-11-02  19:11
 * @Description: TODO
 * @Version: 1.0
 */

//
public class MyRunnable implements Runnable {

    //volatile修饰符
    private volatile boolean active;
    public void run()
    {
        active = true;
        while (active)  //第一行
        {
            //代码
        }
    }

    public void stop()
    {
        active = false; //第二行
    }
}
