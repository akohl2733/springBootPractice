package com.example.akohl.service;

import com.example.akohl.model.Quote;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotivationService {

    public List<Quote> getAllQuotes(){
        return List.of(
                new Quote("Ernest Hemingway", "Courage is grace under pressure"),
                new Quote("Bruce Wayne", "I'm Batman"),
                new Quote("Zeke and Chloe", "Woof")
        );
    }

    public String getStatusMessage(){
        return "We are on track here";
    }
}
