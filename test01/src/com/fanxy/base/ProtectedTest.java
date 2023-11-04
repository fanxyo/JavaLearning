package com.fanxy.base;

/**
 * @BelongsProject: test01
 * @BelongsPackage: com.fanxy.base
 * @Author: fanxingyu
 * @CreateTime: 2023-11-01  20:53
 * @Description: TODO
 * @Version: 1.0
 */

//接口及接口的的成员变量和成员方法不能声明为protected
public interface ProtectedTest {
    default void fun(){}
}
