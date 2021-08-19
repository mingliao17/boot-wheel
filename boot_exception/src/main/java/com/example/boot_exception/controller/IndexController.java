package com.example.boot_exception.controller;

import com.example.boot_exception.common.BizException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/5/20 22:11
 * @Descrption: change_the_world
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @GetMapping("/NullException")
    @ResponseBody
    public String NullException(){
        String str = null;
        str.toString();
        return  "test is ok!";
    }

    @GetMapping("/BizException")
    @ResponseBody
    public String BizException() throws BizException {
        if(1 == 1){//如果你能改变世界
            throw new BizException("-1","这边是一个业务异常，自定义的反馈");
        }
        return  "test is ok!";
    }

    @GetMapping("/UnKnownException")
    @ResponseBody
    public String UnKnownException() {
        Integer.valueOf("生活像一把无形刻刀");
        return  "test is ok!";
    }


}
