package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your first word");
        String word1 = myScanner.nextLine();

        System.out.println("Please enter your second word");
        String word2 = myScanner.nextLine();

        System.out.println("Please enter your third word");
        String word3 = myScanner.nextLine();

        System.out.println("Please enter your fourth word");
        String word4 = myScanner.nextLine();

        System.out.println("Please enter your fifth word");
        String word5 = myScanner.nextLine();

        String [] userArr = {word1, word2, word3, word4, word5};
        System.out.println(Arrays.toString(userArr));
    }
}
