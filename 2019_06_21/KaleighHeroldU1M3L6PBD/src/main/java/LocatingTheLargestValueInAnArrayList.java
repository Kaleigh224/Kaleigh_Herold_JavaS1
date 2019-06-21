import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LocatingTheLargestValueInAnArrayList {
        public static void main(String[] args) {
            List<Integer> arrList = new ArrayList<>();
            Random randomValue = new Random();
            Scanner myScanner = new Scanner(System.in);
            int randomNums;

            for(int i = 0; i < 10; i++) {
                randomNums = randomValue.nextInt(50) + 1;
                arrList.add(randomNums);
            }

            System.out.println("ArrayList: " + arrList);
            int max = arrList.get(0);
            for (int next : arrList) {
                if (next > max) {
                    max = next;
                }
            }
                System.out.println("The largest value is " + max + ", which is in slot " + arrList.indexOf(max));
        }

    }
