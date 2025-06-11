package com.example.akohl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.akohl.model.Quote;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class FirstRestController {

    @GetMapping("/status")
    public String getStatus(){
        return "You're crushing it. Getting to work";
    }

    @GetMapping("/quote")
    public List<Quote> getQuote(){
        return List.of(
                new Quote("Ernest Hemingway", "Courage is grace under pressure"),
                new Quote("Bruce Wayne", "I'm Batman"),
                new Quote("Zeke and Chloe", "Woof")
        );
    }
}
