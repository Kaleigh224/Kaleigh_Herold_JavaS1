package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
        System.out.println("Type in your age to see what you can do!");
        int age = myScanner.nextInt();

        if(age >= 18) {
            System.out.println("vote");
        }else if(age >= 21) {
            System.out.println("drink");
        }else if(age >= 35) {
            System.out.println("president");
        }else if(age >= 55) {
            System.out.println("aarp");
        }else if(age >= 65) {
            System.out.println("retire");
        }else if(age >= 100) {
            System.out.println("century");
        }else{
            System.out.println("");
        }
    }
}
