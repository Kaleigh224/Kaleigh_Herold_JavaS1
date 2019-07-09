package com.company.controller;

import com.company.model.Magic8Ball;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8BallServiceController {
    // Creating random to randomize the responses
    Random r = new Random();

    // Creating list to store the magic 8 ball responses
    private List<Magic8Ball> magic8BallResponseList = new ArrayList<>();

    // Magic 8 ball responses
    Magic8Ball response1 = new Magic8Ball("", "It is certain.");
    Magic8Ball response2 = new Magic8Ball("", "Reply hazy, try again.");
    Magic8Ball response3 = new Magic8Ball("","Outlook not so good.");
    Magic8Ball response4 = new Magic8Ball("","As I see it, yes.");
    Magic8Ball response5 = new Magic8Ball("","Better not tell you now.");
    Magic8Ball response6 = new Magic8Ball("","My sources say no.");


    // Setting up our POST route
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic8Ball getResponse(@RequestBody String magic8Ball) {

        //adding responses to magic8BallResponseList
        magic8BallResponseList.add(response1);
        magic8BallResponseList.add(response2);
        magic8BallResponseList.add(response3);
        magic8BallResponseList.add(response4);
        magic8BallResponseList.add(response5);
        magic8BallResponseList.add(response6);

        // Call random and generate random response to question
        Magic8Ball randomRes = magic8BallResponseList.get(r.nextInt(magic8BallResponseList.size()));

//        String question = magic8Ball.getQuestion();
//        String answer = question + " " + randomRes;

        return randomRes;
    }
}
