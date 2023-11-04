package com.fanxy.obj_classDemo;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.obj_classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  10:56
 * @Description: TODO
 * @Version: 1.0
 */
//class OuterClass{
//    int x = 10;
//    //静态内部类，可直接访问，不需创建外部类
//    static class InnerClass{
//        int y = 5;
//    }
//}

//public class MyMainClass {
//    public static void main(String[] args) {
//        //非静态内部类、私有内部类访问成员变量，需创建外部类
//        //OuterClass myOuter= new OuterClass();
//        //OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        OuterClass.InnerClass myInner= new OuterClass.InnerClass();
//        System.out.println(myInner.y);
//    }
//}

class OuterClass{
    int x = 10;
    //从内部类访问 外部类成员
    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}

public class MyMainClass {
    public static void main(String[] args) {
        OuterClass myOuter= new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}