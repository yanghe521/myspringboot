package com.atynghe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {

    @GetMapping("/hello")
    public String hello2(){
        return "hahagggghademo0399999----";
    }
}
