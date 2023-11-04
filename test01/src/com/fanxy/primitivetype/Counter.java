package com.fanxy.primitivetype;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.primitivetype
 * @Author: fanxingyu
 * @CreateTime: 2023-10-31  23:30
 * @Description: TODO
 * @Version: 1.0
 */
public class Counter {

    public static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("目前位置创建的对象数：" + Counter.getCount());
    }
}
