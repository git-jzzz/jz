package com.jz.common.model;

import lombok.Data;

/**
 * @author: jz
 * @Date: 2020/10/27 15:43
 * @Description: 返回数据
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
    private boolean success = false;


    public void setData(T data) {
        if (data != null) {
            this.success = true;
            this.data = data;
        } else {
            this.success = false;
        }
    }

    public boolean isSuccess() {
        return this.success;
    }
}
