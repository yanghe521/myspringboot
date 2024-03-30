package com.atynghe.web.Controller;

import com.atynghe.web.bean.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/person")
    public Person person(){
        Person person = new Person();
        person.setId(1L);
        person.setName("张三");
        person.setAge(18);
        person.setEmail("aaa@qq.com");
        return person;
    }


}
