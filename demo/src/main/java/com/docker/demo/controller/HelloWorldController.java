package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello-app")
public class HelloWorldController {
    @GetMapping
    public Object helloWorld() {
        Map<String,String> map = new HashMap<>();
        map.put("text","Hello world");
        return  map;
    }
}
