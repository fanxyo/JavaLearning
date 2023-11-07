package com.fanxy.encapsulation;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.encapsulation
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  19:20
 * @Description: TODO Java封装类
 * @Version: 1.0
 */
public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
