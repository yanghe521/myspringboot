package com.atynghe.boot3demo02.config;

import com.alibaba.druid.FastsqlException;
import com.atynghe.boot3demo02.bean.Cat;
import com.atynghe.boot3demo02.bean.Dog;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@Import(FastsqlException.class)
public class Appconfig2 {
    @ConditionalOnClass(name="com.alibaba.druid.FastsqlException")
    @Bean
    public Cat cat01(){
        return new Cat();
    }



    @ConditionalOnMissingClass("com.alibaba.druid.FastsqlException")
    @Bean
    public Dog dog01(){
        return new Dog();
    }
}
