package com.alexbt.springnative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {

    @GetMapping("/test")
    public String test(){
        return "ok";
    }
}
