package com.company;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your current earth weight: ");
        int currentWeight = myScanner.nextInt();

        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus  " + "2. Mars  " + "3. Jupiter  ");
        System.out.println("4. Saturn  " + "5. Uranus  " + "6. Neptune  ");
        int planetChoice = myScanner.nextInt();

        float totalWeight1 = currentWeight * .78f;
        float totalWeight2 = currentWeight * .39f;
        float totalWeight3 = currentWeight * 2.65f;
        float totalWeight4 = currentWeight * 1.17f;
        float totalWeight5 = currentWeight * 1.05f;
        float totalWeight6 = currentWeight * 1.23f;

        switch (planetChoice) {
            case 1:
                System.out.println("Your weight would be " + totalWeight1 + " on that planet.");
                break;
            case 2:
                System.out.println("Your weight would be " + totalWeight2 + " on that planet.");
                break;
            case 3:
                System.out.println("Your weight would be " + totalWeight3 + " on that planet.");
                break;
            case 4:
                System.out.println("Your weight would be " + totalWeight4 + " on that planet.");
                break;
            case 5:
                System.out.println("Your weight would be " + totalWeight5 + " on that planet.");
                break;
            case 6:
                System.out.println("Your weight would be " + totalWeight6 + " on that planet.");
                break;
        }

    }

}
