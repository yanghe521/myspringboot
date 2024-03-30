package com.atynghe.web.config;

import com.atynghe.web.Component.MyYamlHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class Mywebconfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//                WebMvcConfigurer.super.configureMessageConverters(converters);
                converters.add(new MyYamlHttpMessageConverter());
            }
        };
    }
}
