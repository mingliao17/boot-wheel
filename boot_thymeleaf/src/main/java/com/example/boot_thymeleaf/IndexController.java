package com.example.boot_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: mingliao17
 * @CreateTime: 2020/5/20 21:51
 * @Descrption: change_the_world
 */
@RequestMapping("/page")
@Controller
public class IndexController {

    @GetMapping("/welcome-1")
    public String one(){
        return "/page/welcome-1";
    }

    @GetMapping("/welcome-2")
    public String two(){
        return "/page/welcome-2";
    }

    @GetMapping("/welcome-3")
    public String three(){
        return "/page/welcome-3";
    }
}
