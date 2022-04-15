package com.berrinho.spring5jokesappv2.controllers;


import com.berrinho.spring5jokesappv2.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @RequestMapping("/")
    public String getJoke(Model model, JokeServiceImpl jokeGenerator) {

        model.addAttribute("joke", jokeGenerator.getJoke());
        //pass model to thymeleaf template
        return("index");
    }
}
