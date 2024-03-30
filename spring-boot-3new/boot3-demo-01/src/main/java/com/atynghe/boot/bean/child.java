package com.atynghe.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class child {
private String name;
private Integer age;
private Date birthDay;
private List<String> text;
}
