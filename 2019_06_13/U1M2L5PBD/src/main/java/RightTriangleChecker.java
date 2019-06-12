import java.util.*;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");

        System.out.println("Side 1: ");
        int firstSide = myScanner.nextInt();
        System.out.println("Side 2: ");
        int secondSide = myScanner.nextInt();

        while(secondSide < firstSide) {
            System.out.println(secondSide + " is smaller than " + firstSide + ". Try again.");
            System.out.println("Side 2: ");
            secondSide = myScanner.nextInt();
        }

        System.out.println("Side 3: ");
        int thirdSide = myScanner.nextInt();

        while(thirdSide < secondSide) {
            System.out.println(thirdSide + " is smaller than " + secondSide + ". Try again.");
            System.out.println("Side 3: ");
            thirdSide = myScanner.nextInt();
        }

        System.out.println();
        System.out.println("Your three sides are " + firstSide + " " + secondSide + " " + thirdSide + ".");
        int total = (firstSide * firstSide) + (secondSide * secondSide);
        double side3 = Math.sqrt(total);
        if(side3 == thirdSide) {
            System.out.println("These sides *do* make a right triangle. Yippy-skippy!");
        } else {
            System.out.println("NO! These sides do not make a right triangle!");
        }
    }
}
