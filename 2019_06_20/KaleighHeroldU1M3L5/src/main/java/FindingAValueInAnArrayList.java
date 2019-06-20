import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindingAValueInAnArrayList {
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
        System.out.print("Pick a number. ");
        int userNum = myScanner.nextInt();

        if(arrList.contains(userNum)) {
            System.out.println(userNum + " is in the ArrayList.");
        }
    }
}
