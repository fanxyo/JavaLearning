package com.fanxy.encapsulation;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.encapsulation
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  19:24
 * @Description: TODO 访问封装类中的变量
 * @Version: 1.0
 */
public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12345ms");
        System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}
