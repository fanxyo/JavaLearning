package com.fanxy.obj_classDemo;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.obj_classDemo
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  12:40
 * @Description: TODO
 * @Version: 1.0
 */
public class EmployeeTest {

    public static void main(String[] args) {
        //使用构造器创建两个对象
        Employee emp1 = new Employee("Tom");
        Employee emp2 = new Employee("Jack");

        //调用两个对象的成员方法
        emp1.empAge(23);
        emp1.empDesignation("高级程序员");
        emp1.empSalary(1000);
        emp1.printEmployee();

        emp2.empAge(22);
        emp2.empDesignation("菜鸟程序员");
        emp2.empSalary(500);
        emp2.printEmployee();
    }
}
