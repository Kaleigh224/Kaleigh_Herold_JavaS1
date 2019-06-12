package com.company.interfaces;

import java.util.Scanner;

public class BetterInput implements UserIO{
    Scanner myScanner = new Scanner(System.in);
    public int readInt(String prompt) {
        System.out.println(prompt);
        int userInt = myScanner.nextInt();
        return userInt;
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        long userLong = myScanner.nextLong();
        return userLong;
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        double userDouble = myScanner.nextDouble();
        return userDouble;
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        float userFloat = myScanner.nextFloat();
        return userFloat;
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        String userString = myScanner.nextLine();
        return userString;
    }
}
