package com.fanxy.primitivetype;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.primitivetype
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  23:19
 * @Description: TODO
 * @Version: 1.0
 */
public class CYVariable {
    private int a;  //私有成员变量a
    private String b = "Hello"; //公有成员变量b

    public static void main(String[] args) {
        CYVariable obj = new CYVariable();  //创建对象
        obj.a = 10; //访问成员变量a,并设置其值为10
        System.out.println("a = " + obj.a);

        obj.b = "World"; //访问成员变量b,并设置其值为Worlda
        System.out.println("b = " + obj.b);
    }

}
