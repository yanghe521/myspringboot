package com.atynghe.boot3demo02.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component("pig01")
@ConfigurationProperties(prefix="pig")
public class Pig {
    private Long id;
    private String name;
    private Integer age;


}
