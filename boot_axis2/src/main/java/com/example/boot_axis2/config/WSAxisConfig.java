package com.example.boot_axis2.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WSAxisConfig {

    /**
     * servlet过滤规则
     * @return
     */
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        ServletRegistrationBean axisServlet = new ServletRegistrationBean(new AxisServlet(), "/axis/*");
        axisServlet.setName("axisServlet");
        axisServlet.setLoadOnStartup(1);

        return axisServlet;
    }

}
