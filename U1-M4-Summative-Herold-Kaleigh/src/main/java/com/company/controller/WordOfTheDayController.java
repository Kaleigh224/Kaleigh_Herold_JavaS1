package com.company.controller;

import com.company.model.Words;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordOfTheDayController {

    // Creating a list of words
    private List<Words> wordsList = new ArrayList<>();
    // Create random to generate random word
    Random r = new Random();
    Words word1 = new Words("Accio", "Incantation of the Summoning Charm.");
    Words word2 = new Words("Disapparate", "To disappear at will.");
    Words word3 = new Words("Fizzing Whizzbee", "Wizarding sweets. Sherbet balls that make you levitate several feet in the air when you eat them.");
    Words word4 = new Words("Galleon", "Gold wizarding money.");
    Words word5 = new Words("Hippogriff", "Magical creature that has the front legs, wings and head of an eagle, and the body, hind legs and tail of a horse.");
    Words word6 = new Words("Howler", "Wizarding letter which, when opened, shrieks and howls at the reader in an extremely loud voice. ");
    Words word7 = new Words("Mudblood", "Term used to describe a person who has non-magical parents. This term is considered a great insult.");
    Words word8 = new Words("Muggle","Person totally without magical powers. Most Muggles live in ignorance of the world of wizards and witches.");
    Words word9 = new Words("Niffler", "Magical creatures that can find buried treasure. Nifflers are black and fluffy with long snouts and spade-like feet.");
    Words word10 = new Words("Nox", "Spell to extinguish light coming from your wand.");




    // Setting up route
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Words getWord() {
        // adding the words and their definitions to the wordsList
        wordsList.add(word1);
        wordsList.add(word2);
        wordsList.add(word3);
        wordsList.add(word4);
        wordsList.add(word5);
        wordsList.add(word6);
        wordsList.add(word7);
        wordsList.add(word8);
        wordsList.add(word9);
        wordsList.add(word10);

        // Call random and generate next Int
        int index = r.nextInt(wordsList.size());

        // returning a random word from our list
        return wordsList.get(index);

    }
}
