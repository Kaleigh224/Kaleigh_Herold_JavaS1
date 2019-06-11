package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLoLimitedTries {
    public static void main(String[] args) {
        Random number = new Random();
        int x = 1 + number.nextInt(100);
        Scanner myScanner = new Scanner(System.in);
        int guesses = 1;

        System.out.println("You have 7 tries to guess what number I am thinking of from 1 to 100.");
        int userGuess = 0;

        while(x != userGuess && guesses <= 7) {
            System.out.println("Guess #" + (guesses++) + ": ");
            userGuess = myScanner.nextInt();

            if(x == userGuess) {
                System.out.println("Correct! Excellent guess!");
            }else if(x > userGuess && guesses <= 7) {
                System.out.println("Too low.");
            }else if(x < userGuess && guesses <= 7) {
                System.out.println("Too high.");
            }
        }if (guesses >= 7 && x != userGuess) {
            System.out.println("You took too many guesses. You lose.");
        }
    }
}
