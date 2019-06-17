package com.company;

import java.util.Scanner;

import java.util.Arrays;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your first number");
        int number1 = myScanner.nextInt();

        System.out.println("Please enter your second number");
        int number2 = myScanner.nextInt();

        System.out.println("Please enter your third number");
        int number3 = myScanner.nextInt();

        System.out.println("Please enter your fourth number");
        int number4 = myScanner.nextInt();

        System.out.println("Please enter your fifth number");
        int number5 = myScanner.nextInt();

        int [] userArray = {number1, number2, number3, number4, number5};
        System.out.println(Arrays.toString(userArray));


    }
}
