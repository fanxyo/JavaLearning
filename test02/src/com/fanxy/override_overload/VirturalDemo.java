package com.fanxy.override_overload;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.override_overload
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  13:28
 * @Description: TODO
 * @Version: 1.0
 */
public class VirturalDemo {
    public static void main(String[] args) {
        Salary s=new Salary("员工A","北京",3,3600.00);
        Employee e = new Salary("员工B","上海",2,2400.00);
        System.out.println("使用 salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck -- ");
        e.mailCheck();

    }
}
