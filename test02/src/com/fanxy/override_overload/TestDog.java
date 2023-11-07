package com.fanxy.override_overload;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.override
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  10:33
 * @Description: TODO
 * @Version: 1.0
 */
public class TestDog {

//    static class Animal{
//        public void move(){
//            System.out.println("动物可以移动");
//        }
//    }
//
//    static class Dog extends Animal{
//        public void move(){
//            System.out.println("狗可以跑和走");
//        }
//    }

    public static void main(String[] args) {
        Animal a = new Animal();    // Animal对象
        Animal b = new Dog();    // Dog对象

        a.move();   // 执行Animal类的方法
        b.move();   // 执行Dog类的方法
//        b.bark(); // b的引用类型Animal没有bark方法，编译错误，Animal中添加bark方法即可
    }
}
