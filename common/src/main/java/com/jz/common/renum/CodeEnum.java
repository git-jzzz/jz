package com.jz.common.renum;

/**
 * @author: jz
 * @Date: 2020/10/27 15:45
 * @Description: 常用错误枚举类
 */
public enum CodeEnum {
    //枚举状态码
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(200,"成功"),
    USER_NOT_EXIST(1,"用户不存在"),
    USER_IS_EXIST(2,"用户已存在"),
    DATA_IS_NULL(3,"数据为空");

    private Integer code;
    private String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return code;
    }

    public  String getMsg(){
        return msg;
    }
}
