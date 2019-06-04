package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = myScanner.nextInt();

        System.out.println("Please enter another number.");
        int num2 = myScanner.nextInt();

        System.out.println("Please enter one more number.");
        int num3 = myScanner.nextInt();

        int product = num1 * num2 * num3;

        System.out.println("The product of your numbers is: " + product);
    }
}