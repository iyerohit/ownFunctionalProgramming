package com.functional.azure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String getHello() {

        return "YOu are calling hellow world function in java hello deployed in azure";
    }

    @RequestMapping("/")
    public String getNormal() {

        return "YOu are calling hellow world function in java deployed in azure";
    }

}
