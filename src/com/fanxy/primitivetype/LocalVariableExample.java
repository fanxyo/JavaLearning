package com.fanxy.primitivetype;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.primitivetype
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  22:58
 * @Description: TODO
 * @Version: 1.0
 */
public class LocalVariableExample {
//    public static void main(String[] args) {
//        int a = 10; // 局部变量a的声明和初始化
//        int b;      // 局部变量b的声明
//        b = 20;     //局部变量b的初始化
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        //如果使用之前不初始化局部变量，编译器会报错
////        int c;
////        System.out.println("c = " + c);
//    }

    public void pupAge(){
        int age = 0;    //局部变量必须初始化，否则报错
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        LocalVariableExample test = new LocalVariableExample();
        test.pupAge();
    }

}
