package com.berrinho.spring5jokesappv2.services;

import guru.springframework.norris.chuck.*;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //note that this declaration is not ideal - should use spring configuration to declare bean
    public JokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {

        return (chuckNorrisQuotes.getRandomQuote());
    }
}
