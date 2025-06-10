package com.example.akohl.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class firstRestController {

    @GetMapping("/api/user")
    public Map<String, String> getUser(){
        return Map.of(
                "name", "Andrew",
                "email", "akohl2733@gmail.com"
        );
    }
}
