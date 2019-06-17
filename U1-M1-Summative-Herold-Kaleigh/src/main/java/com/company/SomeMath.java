package com.company;

public class SomeMath {
    public static void main(String[] args) {

        int sum = total5(1, 2, 3, 4, 5);
        System.out.println(sum);

        double average = average5(1, 3, 5, 7, 9);
        System.out.println(average);

        double highestNumber = largest5(42.0, 35.1, 2.3, 40.2, 15.6);
        System.out.println(highestNumber);

    }

    public static int total5(int a, int b, int c, int d, int e) {
        int total = a + b + c + d + e;

        return total;
    }

    public static double average5(int a, int b, int c, int d, int e) {
        int average = (a + b + c + d + e) / 5;

        return average;

    }

    public static double largest5(double a, double b, double c, double d, double e) {
        double max = a;

        if(b > max) {
            max = b;
        }if(c > max) {
            max = c;
        }if(d > max) {
            max = d;
        }if(e > max){
            max = e;
        }
        return max;
    }
}
