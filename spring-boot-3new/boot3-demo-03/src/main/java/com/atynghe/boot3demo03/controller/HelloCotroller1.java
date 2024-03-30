package com.atynghe.boot3demo03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller1 {

    @GetMapping("/hello1")
    public String hello(){
        return "hahsssahadssssedfskkkksssdfmo";
    }
}
