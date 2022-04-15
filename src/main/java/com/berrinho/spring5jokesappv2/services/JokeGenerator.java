package com.berrinho.spring5jokesappv2.services;

import guru.springframework.norris.chuck.*;

public class JokeGenerator {

    public String getJoke() {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        return (jokes.getRandomQuote());
    }
}
