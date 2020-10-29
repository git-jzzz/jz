package com.jz.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jz.common.model.Result;
import com.jz.common.service_api.user.UserService;
import com.jz.common.util.ResultUtils;

/**
 * @author: jz
 * @Date: 2020/10/27 16:35
 * @Description: 用户实现类
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {
    @Override
    public Result getAllUser() {
        return ResultUtils.successIFNotNull(null);
    }
}
