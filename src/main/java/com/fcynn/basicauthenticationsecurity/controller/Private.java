package com.fcynn.basicauthenticationsecurity.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
@AllArgsConstructor
public class Private {
    @GetMapping
    public String helloWorldPrivate(){
        return "Hello World! from private endpoint";
    }
    @GetMapping("/user")
    public String helloWorldUserPrivate(){
        return "Hello World! from user private endpoint";
    }
    @GetMapping("admin")
    public String helloWorldAdminPrivate(){
        return "Hello World! from admin private endpoint";
    }
}
