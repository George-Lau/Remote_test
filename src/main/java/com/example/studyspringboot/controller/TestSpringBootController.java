package com.example.studyspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestSpringBootController {

    @RequestMapping("/spring")
    public String hello(){
        return "SpringBoot SUCCESS!";
    }
}
