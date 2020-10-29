package com.jz.blog;

import com.jz.common.model.Result;
import com.jz.common.util.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jz
 * @Date: 2020/10/29 18:17
 * @Description:
 */
@RestController
public class Controller {

    @GetMapping("/hello")
    public Result hello(){
        return ResultUtils.success("hello");
    }
}
