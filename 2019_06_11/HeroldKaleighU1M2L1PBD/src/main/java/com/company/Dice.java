package com.company;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
        System.out.println();
        Random diceRoll = new Random();
        int x = 1 + diceRoll.nextInt(6);

        int firstRoll = 1 + diceRoll.nextInt(6);
        System.out.println("Roll #1: " + firstRoll);
        System.out.println();

        int secondRoll = 1 + diceRoll.nextInt(6);
        int sum = secondRoll + firstRoll;
        System.out.println("Roll #2: " + secondRoll);
        System.out.println();
        System.out.println("The total is " + sum + "!");
    }
}
