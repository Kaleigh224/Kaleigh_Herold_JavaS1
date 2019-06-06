package com.company;

import java.util.Scanner;

//import static java.lang.Math.pow;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the amount of your mortgage?");
        int amount = myScanner.nextInt();

        System.out.println("What is the term of your mortgage?");
        int term = myScanner.nextInt();

        System.out.println("What is the annual interest rate?");
        double rate = myScanner.nextFloat();
        double monthly = (rate / 100) / 12;

        double n = Math.pow(monthly + 1, term);
        double mortgage = (amount * (monthly * n))/(n - 1);
        System.out.printf("%.3f", mortgage);
    }
}


//L[c(1 + c)n]/[(1 + c)n - 1]