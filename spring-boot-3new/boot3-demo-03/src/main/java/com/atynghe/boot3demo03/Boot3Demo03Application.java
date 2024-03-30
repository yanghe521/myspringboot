package com.atynghe.boot3demo03;

import com.atynghe.controller.HelloCotroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan({"com.atynghe.controller","com.atynghe.boot3demo03.controller"})
public class Boot3Demo03Application {

    public static void main(String[] args) {
        var ioc = SpringApplication.run(Boot3Demo03Application.class, args);
        String[] names = ioc.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
