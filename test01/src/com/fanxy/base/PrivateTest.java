package com.fanxy.base;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.base
 * @Author: fanxingyu
 * @CreateTime: 2023-11-01  20:06
 * @Description: TODO
 * @Version: 1.0
 */


public class PrivateTest {
    //私有访问修饰符private
    private String format;

    //定义getFormat()和setFormat()方法，其他类可以访问该变量
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
