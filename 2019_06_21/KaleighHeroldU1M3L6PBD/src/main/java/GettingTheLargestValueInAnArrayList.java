import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GettingTheLargestValueInAnArrayList {
    public static void main(String[] args) {
        List<Integer> arrInteger = new ArrayList<>();

        Random randomValue = new Random();
        Scanner myScanner = new Scanner(System.in);
        int randomNums;

        for (int i = 0; i < 10; i++) {
            randomNums = randomValue.nextInt(100) + 1;
            arrInteger.add(randomNums);
        }
        System.out.println("ArrayList: " + arrInteger);
        int max = arrInteger.get(0);
        for (int next : arrInteger) {
            if (next > max) {
                max = next;
            }
        }
        System.out.println("The largest value is " + max);
    }

}

