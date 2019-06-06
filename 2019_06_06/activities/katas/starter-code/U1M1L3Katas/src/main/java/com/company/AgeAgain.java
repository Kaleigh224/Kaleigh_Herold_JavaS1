package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String grade, college, whichCollege, afterSchool, job;
        System.out.println("What is your age?");
        int userInput = Integer.parseInt(myScanner.nextLine());

        if (userInput < 14) {
            System.out.println("What grade number are you in?");
            grade = myScanner.nextLine();

            System.out.println("Wow! " + grade + " grade - that sounds exciting!");
        } else if (userInput >= 14 && userInput <= 18) {
            System.out.println("Are you planning on going to college?");
            college = myScanner.nextLine();

            if (college.equals("yes")) {
                System.out.println("Which college?");
                whichCollege = myScanner.nextLine();
                System.out.println(whichCollege + " is a great school!");
            } else if (college.equals("no")) {
                System.out.println("What do you want to do after high school?");
                afterSchool = myScanner.nextLine();
                System.out.println("Wow, " + afterSchool + " sounds like a plan!");
            } else {
                System.out.println("Please respond yes or no.");
            }
        } else if(userInput > 18) {
            System.out.println("What kind of job do you have?");
            job= myScanner.nextLine();
            System.out.printf("%s",job + " sounds like a great job!");
        } else {
            System.out.println("Invalid response.");
        }
    }
}
//        System.out.println("What is your age?");
//        int userInput = myScanner.nextInt();
//
//
//        if(userInput < 14) {
//            System.out.println("What grade are you in?");
//            int grade = myScanner.nextInt();
//            System.out.println("Wow! " + grade + " - that sounds exciting!");
//        } else if(userInput == 14 || <= 18)
    }
}
