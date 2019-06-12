import java.util.*;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");

        System.out.println("Please enter a number.");
        int userNum = myScanner.nextInt();

        if(userNum < 0) {
            do{
                System.out.println("You can't take the square root of a negative number, silly.");
                System.out.println("Try again: ");
                userNum = myScanner.nextInt();
            } while(userNum < 0);
        }

        double sqRoot = Math.sqrt(userNum);
        System.out.println("The square root of " + userNum + " is " + sqRoot);
    }
}
