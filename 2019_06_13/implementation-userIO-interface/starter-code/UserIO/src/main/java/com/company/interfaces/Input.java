package com.company.interfaces;

import java.util.*;

public class Input implements UserIO{
    Scanner myScanner = new Scanner(System.in);
    public int readInt(String prompt) {
        System.out.println(prompt);
        int userInt = Integer.parseInt(myScanner.nextLine());
        return userInt;
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        long userLong = Long.parseLong(myScanner.nextLine());
        return userLong;
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        double userDouble = Double.parseDouble(myScanner.nextLine());
        return userDouble;
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        float userFloat = Float.parseFloat(myScanner.nextLine());
        return userFloat;
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        String userString = myScanner.nextLine();
        return userString;
    }
}
