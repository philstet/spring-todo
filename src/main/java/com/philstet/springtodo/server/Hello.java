package com.philstet.springtodo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
