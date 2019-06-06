package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class IsJavaKeyword {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    String[] keywords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};

        System.out.println("Please input any Java keywords you may know.");

        String word = myScanner.nextLine();

        if (Arrays.asList(keywords).contains(word)) {
            System.out.println(word + " is a Java keyword!");
        } else {
            System.out.println(word + " is not a Java keyword!");
        }

    }
}

