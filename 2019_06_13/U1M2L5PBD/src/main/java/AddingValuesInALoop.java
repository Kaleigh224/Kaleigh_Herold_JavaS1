import java.util.*;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me");
        System.out.print("Number: ");
        int userNumber = myScanner.nextInt();
        int sum = userNumber;

        while(userNumber != 0){
            System.out.println("The total so far is " + sum);
            System.out.print("Number: ");
            userNumber = myScanner.nextInt();
            sum += userNumber;
        }
        System.out.println("The total is " + sum);
    }
}
