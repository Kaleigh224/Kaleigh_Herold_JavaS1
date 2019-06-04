package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int num = myScanner.nextInt();

        int sum = num + 13;

        System.out.println("The sum of your number and the number 13 is: " + sum);
    }
}
