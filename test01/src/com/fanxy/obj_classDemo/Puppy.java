package com.fanxy.obj_classDemo;

import jdk.nashorn.internal.objects.annotations.Constructor;

public class Puppy {
    //无参构造方法

//    public Puppy() {
//    }
    //
//    public Puppy(String name) {
//    /**
//     * @Description:仅有一个参数name的构造器
//     * @param: name
//     * @return:
//     */
//
//        System.out.println("小狗的名字是：" + name);
//    }
//
//    //创建对象步骤：声明、实例化、初始化
//    public static void main(String[] args) {
//        //下面语句将创建一个Puppy对象
//        //使用new关键字创建对象时，会调用构造方法初始化对象
//        Puppy myPuppy= new Puppy("tommy");
//
//    }
    int puppyAge;
    public Puppy(String name){
        System.out.println("小狗的名字是：" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        //创建对象
        Puppy myPuppy= new Puppy("tommy");
        //通过方法来设定age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        myPuppy.getAge();
        //也可以这样访问成员变量
        System.out.println("变量值：" + myPuppy.puppyAge);
    }

}
