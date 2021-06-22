package com.example.boot_axis2.service;

import org.springframework.stereotype.Service;

@Service("HelloSerivce")
public class HelloService {
    public String sayHello(String username) {
        return "hello,"+username;
    }
}
