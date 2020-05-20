package com.example.boot_exception.common;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/5/20 21:57
 * @Descrption: change_the_world
 */

/**
 * 基础的接口类，自定义的错误描述枚举类需实现该接口。
 */
public interface BaseErrorInfoInterface {

    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}
