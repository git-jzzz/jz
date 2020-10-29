package com.jz.common.util;

import cn.hutool.core.util.StrUtil;
import com.jz.common.model.Result;
import com.jz.common.renum.CodeEnum;

/**
 * @author: jz
 * @Date: 2020/10/27 15:51
 * @Description: 返回工具类
 */
public class ResultUtils {

    //成功 返回数据
    public static <T> Result success(T data) {
        Result result = new Result();
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setMsg(CodeEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    //成功  无返回数据
    public static Result success() {
        return success(null);
    }

    //如果数据不为空返回  否则返回 数据为空
    public static <T> Result successIFNotNull(T data) {
        if (null != data) {
            return success(data);
        } else {
            return Error(CodeEnum.DATA_IS_NULL.getCode(), CodeEnum.DATA_IS_NULL.getMsg());
        }
    }


    //失败返回信息
    public static Result Error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
