package com.example.boot_exception.controller;

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

    @GetMapping("/exception")
    @ResponseBody
    public String testException(){
        String str = null;
        str.toString();
        return  "test is ok!";
    }
}
