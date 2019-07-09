package com.company.controller;

import com.company.model.Quotes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteOfTheDayController {

    // Creating a list of quotes
    private List<Quotes> quotesList = new ArrayList<>();
    // Create random to generate random quote
    Random r = new Random();
    Quotes quote1 = new Quotes("What's comin' will come and we'll meet it when it does.");
    Quotes quote2 = new Quotes("The flower doesn't dream of the bee, it blossoms and the bee comes.");
    Quotes quote3 = new Quotes("Sunshine all the time makes a desert.");
    Quotes quote4 = new Quotes("If you want to be happy, be.");
    Quotes quote5 = new Quotes("Being an adult is the dumbest thing I have ever done.");
    Quotes quote6 = new Quotes("No great thing is created suddenly.");
    Quotes quote7 = new Quotes("Anger is always the shortest distance to a mistake.");
    Quotes quote8 = new Quotes("A mind that is sketched by a new experience can never go back to its old dimensions.");
    Quotes quote9 = new Quotes("Unless someone like you cares a whole awful lot, nothing is going to get better. It's not.");
    Quotes quote10 = new Quotes("Your desire to change must be greater than your desire to stay the same.");

    // Setting up route
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quotes getQuote() {
        quotesList.add(quote1);
        quotesList.add(quote2);
        quotesList.add(quote3);
        quotesList.add(quote4);
        quotesList.add(quote5);
        quotesList.add(quote6);
        quotesList.add(quote7);
        quotesList.add(quote8);
        quotesList.add(quote9);
        quotesList.add(quote10);

        // Call random and generate next Int
        int index = r.nextInt(quotesList.size());

        // return a random quote
        return quotesList.get(index);
    }
}
