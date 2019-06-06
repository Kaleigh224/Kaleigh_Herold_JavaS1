package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose a ceiling number to find all the prime numbers leading up to it.");
        int i, j, yesPrime;
        int prime, yesPrime = 0, yesPrime2 = 0;
        int userAnswer = Integer.parseInt(myScanner.nextLine());
        prime = userAnswer / 2;
        yesPrime = userAnswer - 1;
        if (userAnswer == 0 || userAnswer == 1) {
            System.out.println(userAnswer + " is not a prime number.");
        } else {
            for (i = 2; i <= prime; i++) {
                if (userAnswer % i == 0) {
                    System.out.println(userAnswer + " is not a prime number.");
                    yesPrime = 1;
                    break;
                }
            }
            if (yesPrime == 0) {
                System.out.println(userAnswer + " is a prime number!");
            }
        }
//        if (checkPrime == 0 || checkPrime == 1) {
//            System.out.println(checkPrime + " is not a prime number.");
//        } else {
//
//        for (j = 2; j <= checkPrime; j++) {
//            if (checkPrime % j == 0) {
//                System.out.println(checkPrime + " is not a prime number.");
//                isPrime2 = 1;
////                break;
//            }
//        }
//            if (isPrime2 == 0) {
//                System.out.println(checkPrime + " is a prime number!");
//            }
//        }
    }
}
