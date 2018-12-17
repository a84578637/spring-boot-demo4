package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private String mobile;
    private String telphone;
    private String email;
    private String city;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;


}
