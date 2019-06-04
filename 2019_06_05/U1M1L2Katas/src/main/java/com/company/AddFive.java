package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int num1 = myScanner.nextInt();

        System.out.println("Please enter another number.");
        int num2 = myScanner.nextInt();

        System.out.println("Please enter another number.");
        int num3 = myScanner.nextInt();

        System.out.println("Please enter another number.");
        int num4 = myScanner.nextInt();

        System.out.println("Please enter another number.");
        int num5 = myScanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("The sum of your five numbers is: " + sum);

    }
}
