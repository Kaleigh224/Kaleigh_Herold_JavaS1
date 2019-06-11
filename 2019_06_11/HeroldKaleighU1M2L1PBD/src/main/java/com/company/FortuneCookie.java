package com.company;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random r = new Random();
        int x = 1+r.nextInt(6);



        System.out.println("Fortune cookie says: ");
        if(x == 1) {
            System.out.println("\"You will find the answer soon.\"");
        }else if(x == 2) {
            System.out.println("\"A faithful friend is a strong defense.\"");
        }else if(x == 3) {
            System.out.println("\"A pleasant surprise is waiting for you.\"");
        }else if(x == 4) {
            System.out.println("\"All your hard work will soon pay off.\"");
        }else if(x == 5) {
            System.out.println("\"Change is happening in your life, so go with the flow!\"");
        }else if(x == 6) {
            System.out.println("\"Your difficulties will strengthedn you.\"");
        }
    }
}
