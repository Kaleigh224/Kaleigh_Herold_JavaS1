package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int userNum = myScanner.nextInt();

        if (userNum % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
