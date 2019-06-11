package com.company;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Please enter a number between 1 and 10");
            String inputNumberString = myScanner.nextLine();
            number = Integer.parseInt(inputNumberString);
        } while(number < 1 || number > 10);
        System.out.println(number);
    }
}
