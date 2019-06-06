package com.company;

import java.util.Scanner;

public class CountByThirteen {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = myScanner.nextInt();

        for(int i =0; i < number + 1; i+=13) {
            System.out.println(i);
        }
    }
}
