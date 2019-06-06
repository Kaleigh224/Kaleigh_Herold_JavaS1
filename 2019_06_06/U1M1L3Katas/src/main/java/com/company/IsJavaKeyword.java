package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type a word.");
        String word = myScanner.nextLine();

        String keyword;
        switch (word) {
            case 1: keyword = "abstract";
            break;
            case 2: keyword = "assert";
            break;
        }
    }
}
