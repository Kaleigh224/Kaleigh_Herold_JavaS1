package com.company;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random number = new Random();

        int lowNum = 1;
        int highNum = 10;
        int exactNum = number.nextInt(highNum - lowNum) + lowNum;

        System.out.println("Guess what number I am thinking of from 1 to 10.");

        int guesses = 1;
        System.out.println("Your guess is: ");
        int userGuess = myScanner.nextInt();

        while(userGuess != exactNum) {
            if(userGuess != exactNum) {
                System.out.println("Incorrect. Please try again.");
                System.out.println("Your guess is: ");
                userGuess = myScanner.nextInt();
                guesses++;
            }
        }

        System.out.println("Correct! Great guess!");
        System.out.println("It took you " + guesses + " tries.");
    }
}
