package com.jz.common.model.request;

import lombok.Data;

/**
 * @author: jz
 * @Date: 2020/10/27 16:32
 * @Description: 登录请求数据
 */
@Data
public class LoginRequest {
    private String name;
    private String password;
}
