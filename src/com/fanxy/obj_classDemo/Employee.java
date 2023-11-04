package com.fanxy.obj_classDemo;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.obj_classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  12:29
 * @Description: TODO
 * @Version: 1.0
 */
public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //Employee的构造器
    public Employee(String name) {
        this.name = name;
    }
    //设置age的值
    public void empAge(int empAge){
        age = empAge;
    }
    //设置designation的值
    public void empDesignation(String empDesig) {
        designation= empDesig;
    }
    //设置salary的值

    public void empSalary(double empSalaty) {
        salary = empSalaty;
    }
    //打印信息
    public void printEmployee() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}
