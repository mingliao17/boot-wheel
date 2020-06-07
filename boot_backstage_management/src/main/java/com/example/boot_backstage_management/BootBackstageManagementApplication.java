package com.example.boot_backstage_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.boot_backstage_management.**.mapper")
@SpringBootApplication
public class BootBackstageManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootBackstageManagementApplication.class, args);
    }

}
