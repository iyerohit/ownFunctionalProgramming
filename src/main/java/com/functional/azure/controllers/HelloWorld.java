package com.functional.azure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String getHello() {

        return "YOu are calling hellow world function in java hello deployed in azure";
    }

    @RequestMapping("/")
    public String getNormal() {

        return "YOu are calling default function in java deployed in azure";
    }

    
    @RequestMapping("/message")
    public String getMessage() {

        return "YOu are callingmessage function in java deployed in azure";
    }

}
