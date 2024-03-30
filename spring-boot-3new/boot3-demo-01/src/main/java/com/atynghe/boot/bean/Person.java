package com.atynghe.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private String name;
    private Integer age;

    private Date birthDay;

    private Boolean like;
    private child child;
    private List<Dog> dogs;
    private Map<String,Cat> cats;

}
