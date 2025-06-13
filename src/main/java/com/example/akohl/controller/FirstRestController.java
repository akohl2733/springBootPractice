package com.example.akohl.controller;

import com.example.akohl.service.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.akohl.model.Quote;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class FirstRestController {

    private MotivationService ms;

    @Autowired
    public FirstRestController(MotivationService motiv) {
        this.ms = motiv;
    }

    @GetMapping("/status")
    public String getStatus(){
        return ms.getStatusMessage();
    }

    @GetMapping("/quote")
    public List<Quote> getQuote(){
        return ms.getAllQuotes();
    }

}
