package com.company;

import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the salary for Player 1 (without dollar sign or commas)");
        int playerOne = myScanner.nextInt();

        System.out.println("Please enter the salary for Player 2 (without dollar sign or commas)");
        int playerTwo = myScanner.nextInt();

        System.out.println("Please enter the salary for Player 3 (without dollar sign or commas)");
        int playerThree = myScanner.nextInt();

        int total = playerOne + playerTwo + playerThree;
        System.out.println("The total salary for all three players is: " +  total);

        boolean isOver = total > 40000000;
        int tax = (total - 40000000) * 18/100;


        if (isOver) {
            System.out.print(tax);
        }


    }
}
