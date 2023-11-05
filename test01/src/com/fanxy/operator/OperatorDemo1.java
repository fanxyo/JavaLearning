package com.fanxy.operator;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.operator
 * @Author: fanxingyu
 * @CreateTime: 2023-11-04  16:00
 * @Description: TODO
 * @Version: 1.0
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //基本运算符
        // 1、算数运算符
//        int a = 10;
//        int b = 2;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        //整数除法，结果是整数，因为最高类型是整数
//        System.out.println(a / b);
//        System.out.println(5 / 2);//2
//        System.out.println(5.0 / 2);//2.5
//
//        int i = 5;
//        int j = 2;
//        System.out.println(1.0 * i / j);//2.5
//        System.out.println(a % b);
//
//        // "+" 符号可以做连接符，参与字符串运算，结果是字符串
//        // 区分“+”是否是连接符，看能否运算
//        int a2 = 5;
//        System.out.println("abc" + a2);
//        System.out.println(a2 + 5);
//        System.out.println("fanxy" + a2 + 'a');
//        System.out.println(a2 + 'a' + "fanxy");

        // 2、自增自减运算符
        //单独使用没有区别
        // ++和--如果不是单独使用（在表达式中或者同时有其它操作）
        // 放在变量前面：先对变量进行+1、-1，再拿变量的值进行运算
        // 放在变量后面：先拿变量的值进行运算，再对变量进行+1、-1
//        int a = 10;
//        //a++;
//        ++a;
//        System.out.println(a);
//
//        // a--;
//        a--;
//        System.out.println(a);
//
//        //System.out.println(2++);//自增自减只能操作变量
//
//        System.out.println("-----------------");
//        int i = 10;
//        int rs = ++i;// 先加后用
//        System.out.println(rs);
//        System.out.println(i);
//
//        int j = 10;
//        int rs2 = j++;// 先用后加
//        System.out.println(rs2);
//        System.out.println(j);
//
//        System.out.println("--------------------");
//
//        int m = 5;
//        int n = 3;
//        // m 5 6 5 4
//        // n 3 4 3
//        //             6 -   5 + 5   -   4 + 4   + 3
//        int result = ++m - --m + m-- - ++n + n-- + 3;
//        System.out.println(result);
//        System.out.println(m);
//        System.out.println(n);
//
//        System.out.println("------------------");
//        int c = 10;// 10 11 11 11
//        int d = 5;// 5 4 5
//        //         10 +  11 -   4 -   5 + 1 + 11
//        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
//        System.out.println(rs3);
//        System.out.println(c);
//        System.out.println(d);

        // 3、赋值运算符
        //基本赋值运算符：=
        //扩展赋值运算符：+= -= *= /= %= 隐含强制类型转化
        double a = 666;
        double b = 520;
        //a += b;// a = (double)(a + b)
        //System.out.println(a);

        a-=b;
        System.out.println(a);

        int m = 10;
        int n = 5;
        m%=n;
        System.out.println(m);

        System.out.println("---------------------");
        byte x = 10;
        byte y = 30;
        //x=x+y; // 编译出错
        x+=y; // 等价公式：x = (byte)(x+y)
        System.out.println(x);


    }
}
