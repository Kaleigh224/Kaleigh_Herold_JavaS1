package com.company;

import java.util.Scanner;
public class SubtractTwo {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int num1 = myScanner.nextInt();

        System.out.println("Please enter a second number.");
        int num2 = myScanner.nextInt();

        int difference = num1 - num2;


        System.out.println("The difference between your second number and your first number is: " + difference);
    }
}
