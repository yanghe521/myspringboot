package com.atynghe.boot3demo02.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "sheep")
public class Sheep {
    private Long id;
    private String name;
    private Integer age;

}
