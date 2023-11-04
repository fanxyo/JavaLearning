package com.fanxy.primitivetype;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.primitivetype
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  23:28
 * @Description: TODO
 * @Version: 1.0
 */
public class Employee {
    // 这个成员变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public Employee (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }
    public static void main(String[] args) {
        Employee empOne = new Employee("Mike");
        empOne.setSalary(1000.0);
        empOne.printEmp();
    }
}
