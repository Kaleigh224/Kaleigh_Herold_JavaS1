package com.company;

import java.util.Scanner;

public class ALittleQuiz {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Are you ready for a quiz? Yes or No.");
        String yesOrNo = myScanner.nextLine();

//        if(yesOrNo == "No"){
//            System.out.println("Ok. Have a nice day!");
//        }

            int userAnswer1 = 0;
            int userAnswer2 = 0;
            int userAnswer3 = 0;
            int score = 0;

            System.out.println("Okay, here it comes!");
            System.out.println();
            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("\t1) Melbourne");
            System.out.println("\t2) Anchorage");
            System.out.println("\t3) Juneau");
            System.out.println();
            System.out.println("> ");

            userAnswer1 = myScanner.nextInt();
            System.out.println();
            if(userAnswer1 == 3) {
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Sorry, Juneau is the capital of Alaska.");
            }

            System.out.println();
            System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
            System.out.println("\t1) Yes");
            System.out.println("\t2) no");
            System.out.println();
            System.out.println("> ");
            userAnswer2 = myScanner.nextInt();
            System.out.println();
            if(userAnswer2 == 2) {
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Sorry, \"cat\" is a string. Ints can only store numbers.");
            }

            System.out.println();
            System.out.println("Q3) What is the result of 9+6/3?");
            System.out.println("\t1) 5");
            System.out.println("\t2) 11");
            System.out.println("\t3) 15/3");
            System.out.println();
            System.out.println("> ");
            userAnswer3 = myScanner.nextInt();
            System.out.println();
            if(userAnswer3 == 2) {
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Sorry, 11 is the result.");
            }
            System.out.println();
            System.out.println("Overall, you got " + score + " out of 3 correct.");
            System.out.println("Thanks for playing!");
        }
    }

