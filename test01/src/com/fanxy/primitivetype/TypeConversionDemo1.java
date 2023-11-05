package com.fanxy.primitivetype;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.primitivetype
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  15:44
 * @Description: TODO
 * @Version: 1.0
 */

//类型转换：
//原因：存在不同类型变量赋值给其他类型的变量
public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //自动类型转换--类型范围小的变量可以直接赋值给范围大的变量
//        byte a= 12;     //a:0000 1100(8位)
//        int b= a;       //b:00000000 00000000 00000000 00001100(32位)
//        System.out.println(b);
//
//        int c =100;
//        double d = c;
//        System.out.println(d);
//
//        char ch = 'a';//97 => 00000000 01100001
//        int i = ch;
//        System.out.println(i);

        //表达式的自动类型转换
        //表达式--不同类型的变量或数据一起运算
        // 1、小范围类型的变量，会自动转换成较大范围的类型，再参与运算
        // 2、表达式的最终结果类型由最高类型决定
        // 3、表达式中，byte、short、char是直接转化成int类型参与运算的
//        byte a = 10;
//        int b = 10;
//        long c = 30;
//        long rs = a + b + c;
//        System.out.println(rs);
//
//        double rs2 = a + b + 1.0;
//        System.out.println(rs2);
//
//        byte b1 = 10;
//        byte b2 = 80;
//        int b3 = b1 + b2;//运算时数据范围超过byte类型，byte无法接收
//        System.out.println(b3);

        //强制类型转换 --强行将类型范围大的变量、数据赋值给类型范围小的变量
        // 类型范围大的数据或变量 ，直接赋值给类型范围小的变量，会报错
        // 数据类型 变量2 = (数据类型)变量1、数据
        // 1、强转可能造成数据(丢失)溢出
        // 2、浮点型强转成整型，直接丢掉小数部分，保留整数部分返回

        int a = 20;//00000000 00000000 000000000 00010100
        //强制类型转换为byte Alt + Enter
        byte b = (byte) a;//00010100
        System.out.println("int强制类型转换为byte后的值等于" + b);

        int i= 1500;//00000000 00000000 00000101 11011100
        byte j = (byte) i;                     //11011100
        System.out.println(j);

        double d= 99.5;
        int m = (int) d;
        System.out.println(m);
    }
}
