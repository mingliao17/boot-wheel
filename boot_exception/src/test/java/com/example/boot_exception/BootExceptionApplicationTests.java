package com.example.boot_exception;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootExceptionApplicationTests {

    /**
     * 自定义实现全局异常控制测试,，测试失败，还是走controller吧
     */
    @Test
    void contextLoads() {
        String m = null;
        if (m.equals("m")) {
            System.out.println(123);
        }
    }

}
