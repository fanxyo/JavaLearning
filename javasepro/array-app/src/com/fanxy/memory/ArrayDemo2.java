package com.fanxy.memory;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.memory
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  21:43
 * @Description: TODO 多个数组变量指向同一个数组对象
 * 原因：多个数组变量中存储的是同一个数组对象的地址
 * 多个变量修改的都是同一个数组对象中的数据
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 认识多个变量指向同一个数组的形式，并掌握其注意事项
        int[] arr1 = {11,22,33};

        // 把int类型的数组变量arr1赋值给int类型的数组变量arr2
        int[] arr2 = arr1;
        System.out.println(arr1); // [I@14ae5a5
        System.out.println(arr2); // [I@14ae5a5

        arr2[1] = 99;
        System.out.println(arr1[1]); // 99

        // 注意：如果某个数组变量存储的地址是null，那么该变量将不再指向任何数组对象
        // 可以输出这个变量，值为null，但是不能用这个数组变量去访问数据或者访问数组长度
        // 会报空指针异常
        arr2 = null;
        System.out.println(arr2);
//        System.out.println(arr2[0]); // 空指针异常
//        System.out.println(arr2.length); // 空指针异常
    }
}
