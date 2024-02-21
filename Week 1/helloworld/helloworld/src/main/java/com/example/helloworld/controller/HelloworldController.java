package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/")

    public String getIndex() {
        return "<h1>Hello, World!!<h1>";
    }
}