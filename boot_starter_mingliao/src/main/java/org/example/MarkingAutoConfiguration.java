package org.example;

import org.example.MarkingProperties;
import org.example.MarkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//相当于一个普通的java配置类
@ConditionalOnClass({MarkingService.class})// 当MarkingService 在类路径的条件下
@EnableConfigurationProperties(MarkingProperties.class)// 将 application.properties 的相关的属性字段与该类一一对应，并生成 Bean
public class MarkingAutoConfiguration {

    @Autowired
    private MarkingProperties markingProperties;

    @Bean
    @ConditionalOnMissingBean(MarkingService.class)
    public MarkingService markingService(){
        MarkingService markingService = new MarkingService();
        markingService.setWords(markingProperties.getWords());
        return markingService;
    }
}
