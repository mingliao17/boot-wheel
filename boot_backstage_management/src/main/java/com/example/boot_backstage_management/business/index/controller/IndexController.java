package com.example.boot_backstage_management.business.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/6/6 16:06
 * @Descrption: change_the_world
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "淡定，这本来就是个字符串而已";
    }
}
