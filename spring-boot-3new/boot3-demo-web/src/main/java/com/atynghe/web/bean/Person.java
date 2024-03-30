package com.atynghe.web.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@JacksonXmlRootElement
@Data
public class Person {
    private Long id;
    private String name;
    private String email;
    private Integer age;
}
