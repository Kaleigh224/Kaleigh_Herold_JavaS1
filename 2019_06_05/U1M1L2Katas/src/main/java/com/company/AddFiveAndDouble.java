package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int sum = myScanner.nextInt();

        int answer = (sum + 5) * 2;

        System.out.println("Your number with 5 added to it and then doubled is: " + answer);
    }
}
