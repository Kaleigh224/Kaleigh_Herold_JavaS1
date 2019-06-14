import java.util.*;

public class BabyBlackjack {
    public static void main(String[] args) {
        Random number = new Random();
        int userValue1 = number.nextInt(10) + 1;
        int userValue2 =  number.nextInt(10) + 1;
        int userSum = userValue1 + userValue2;

        int dealerValue1 = number.nextInt(10) + 1;
        int dealerValue2 = number.nextInt(10) + 1;
        int dealerSum = dealerValue1 + dealerValue2;

        System.out.println("Baby Blackjack!");
        System.out.println();
        System.out.println("You drew " + userValue1 + " and " + userValue2);
        System.out.println("Your total is " + userSum);

        System.out.println();
        System.out.println("The dealer drew " + dealerValue1 + " and " + dealerValue2);
        System.out.println("Dealer's total is " + dealerSum);
        System.out.println();

        if(userSum > dealerSum) {
            System.out.println("YOU WIN!");
        } else if(userSum < dealerSum){
            System.out.println("YOU LOSE!");
        } else {
            System.out.println("WOOHOO!!! IT'S A TIE!");
        }
    }
}
