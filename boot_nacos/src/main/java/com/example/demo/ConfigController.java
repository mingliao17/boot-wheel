package com.example.demo;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * 配置服务
 */
@Controller
@RequestMapping("config")
public class ConfigController {


    @NacosValue(value = "${useLocalCache}", autoRefreshed = true)
    private boolean useLocalCache;

    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public boolean get() {
        return useLocalCache;
    }

    @NacosValue(value = "${useLocalName}", autoRefreshed = true)
    private String userLocalName;

    @RequestMapping(value = "/getName", method = GET)
    @ResponseBody
    public String getName(){
        return userLocalName;
    }
}
