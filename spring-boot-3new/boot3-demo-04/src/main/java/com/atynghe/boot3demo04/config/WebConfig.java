package com.atynghe.boot3demo04.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 第一个静态资源路径
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/a/");

        // 第二个静态资源路径
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/b/");
    }
}

