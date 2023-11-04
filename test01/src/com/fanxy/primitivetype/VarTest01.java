package com.fanxy.primitivetype;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.primitivetype
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  16:02
 * @Description: TODO
 * @Version: 1.0
 */
public class VarTest01 {
    /**
     * @Description:Java变量类型
     * @param: null
     * @return:
     */

//    // 成员变量
//    private int instanceVar;
//    // 静态变量
//    private static int staticVar;
//
//    public void method(int paramVar) {
//        // 局部变量
//        int localVar = 10;
//
//        // 使用变量
//        instanceVar = localVar;
//        staticVar = paramVar;
//
//        System.out.println("成员变量: " + instanceVar);
//        System.out.println("静态变量: " + staticVar);
//        System.out.println("参数变量: " + paramVar);
//        System.out.println("局部变量: " + localVar);
//    }
//
//    public static void main(String[] args) {
//        VarTest01 v = new VarTest01();
//        v.method(20);
//    }

    /**
     * @Description:参数变量的使用
     * @param: args
     * @return: void
     */

    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);// 调用swap方法
        System.out.println("a = " + a + ",b = " + b);
    }

    public static void swap(int x, int y) {
        int temp = y;
        x = y;
        y = temp;
    }

}
