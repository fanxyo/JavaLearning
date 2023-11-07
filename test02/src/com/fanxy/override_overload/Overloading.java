package com.fanxy.override_overload;

/**
 * @BelongsProject: test02
 * @BelongsPackage: com.fanxy.override_overload
 * @Author: fanxingyu
 * @CreateTime: 2023-11-07  12:42
 * @Description: TODO 方法重载
 * @Version: 1.0
 */
public class Overloading {
    public int test(){
        System.out.println("test01");
        return 1;
    }

    public void test(int a){
        System.out.println("test02");
    }

    // 以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test03");
        return "returntest03";
    }

    public String test(String s,int a){
        System.out.println("test04");
        return "returntest04";
    }

    public static void main(String[] args) {
        Overloading o=new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test03"));
        o.test("test04",1);
    }
}
