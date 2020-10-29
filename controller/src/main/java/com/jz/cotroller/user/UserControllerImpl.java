package com.jz.cotroller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jz.common.model.Result;
import com.jz.common.service_api.controller.UserController;
import com.jz.common.service_api.user.UserService;
import com.jz.common.util.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jz
 * @Date: 2020/10/27 17:04
 * @Description:
 */
@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    UserService userService;


    @Override
    @GetMapping("/getAllUser")
    public Result getAllUser() {
        return userService.getAllUser();
    }

    @Override
    @GetMapping("/hello")
    public Result hello() {
        return ResultUtils.success("hello --- jenkins success --user  --controller er");
    }
}
