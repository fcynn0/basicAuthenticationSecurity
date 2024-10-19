package com.fcynn.basicauthenticationsecurity.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
@AllArgsConstructor
public class Public {
    @GetMapping
    public String helloWorldPublic(){
        return "Hello World! from public endpoint";
    }
}
