package com.fanxy.define;

/**
 * @BelongsProject: javasepro
 * @BelongsPackage: com.fanxy.define
 * @Author: fanxingyu
 * @CreateTime: 2023-11-19  20:23
 * @Description: TODO 数组访问
 * @Version: 1.0
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        // 数组名[索引]
        int[] arr = {12,14,36};
        // 访问数组的全部数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]); // 不能越界

        // 2.修改数组中的数据
        arr[0] = 19;
        arr[2] = 18;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 3. 访问数组的元素个数
        // 数组的长度属性：length
        System.out.println(arr.length);

        // 技巧：获取数组的最大索引arr.length - 1 (前提是数组中有元素)
        int[] arr2 = {};
        System.out.println(arr2.length -1);
    }
}
