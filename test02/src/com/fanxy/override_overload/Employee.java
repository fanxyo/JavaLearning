package com.fanxy.override_overload;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.override_overload
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  13:15
 * @Description: TODO 多态
 * @Version: 1.0
 */
public class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("邮寄支票给：" + this.name + " " + this.address);
    }

//    @Override
    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", number=" + number +
//                '}';
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
