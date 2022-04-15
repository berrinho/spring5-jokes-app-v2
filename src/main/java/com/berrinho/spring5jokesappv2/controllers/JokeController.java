package com.berrinho.spring5jokesappv2.controllers;

import com.berrinho.spring5jokesappv2.services.JokeGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @RequestMapping("/")
    public String getJoke(Model model, JokeGenerator jokeGenerator) {

        model.addAttribute("joke", jokeGenerator.getJoke());

        return("index");
    }
}
