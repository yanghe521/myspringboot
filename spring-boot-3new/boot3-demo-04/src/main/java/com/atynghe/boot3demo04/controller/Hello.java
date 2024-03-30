package com.atynghe.boot3demo04.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class Hello {


    @GetMapping("/h")
    public String hello(String a,String b){
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.info("info日志。。。参数a:{}b:{}",a,b);
        return "hello";
    }
}
