package com.example.boot_starter_mingliao_implement;

import org.example.MarkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private MarkingService markingService;

    @GetMapping("/")
    public String index(){
        return markingService.sayHello();
    }
}
