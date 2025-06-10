package com.example.akohl.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class firstController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("name", "Andrew");
        return "home";
    }
}
