package com.atynghe.boot;

import com.atynghe.boot.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class, args);
        Person person = ioc.getBean(Person.class);
        System.out.println(person);
    }
}
