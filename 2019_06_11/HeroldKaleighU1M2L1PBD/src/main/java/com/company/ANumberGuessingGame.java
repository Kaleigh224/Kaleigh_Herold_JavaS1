package com.company;

import java.util.Scanner;
import java.util.Random;

public class ANumberGuessingGame {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(10);


        System.out.println("I'm thinking of a number from 1 to 10");
        int userNumber = myScanner.nextInt();

        if(userNumber == computerNumber) {
            System.out.println("Correct~");
        } else if(userNumber != computerNumber) {
            System.out.println("Incorrect. The correct answer is: " + computerNumber);
        }
    }
}
