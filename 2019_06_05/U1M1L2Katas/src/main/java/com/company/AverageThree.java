package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int num1 = myScanner.nextInt();

        System.out.println("Please enter another number.");
        int num2 = myScanner.nextInt();

        System.out.println("Please enter one more number.");
        int num3 = myScanner.nextInt();

        int sum = num1 + num2 + num3;
        float average = sum / 3.00f;

        System.out.printf("The average of your numbers is " + "%.2f\n", average);

    }
}
