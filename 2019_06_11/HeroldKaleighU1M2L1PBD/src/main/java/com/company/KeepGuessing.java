package com.company;

import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random number = new Random();
        int x = 1 + number.nextInt(10);

        System.out.println("I'm thinking of a number from 1 to 10");
        int userGuess = 0;

        while(userGuess != x) {
            System.out.println("Your guess: ");
            userGuess = myScanner.nextInt();

            if(userGuess == x) {
                System.out.println("Correct! Great guess!");
            } else {
                System.out.println("Incorrect. Try again!");
            }
        }

    }
}
