import java.util.*;

public class DiceDoubles {
    public static void main(String[] args) {
        System.out.println("Here comes the dice!");
        System.out.println();

        Random diceNum = new Random();
        int firstDice;
        int secondDice;
        int firstSum = 0;
        firstDice = diceNum.nextInt(6) + 1;
        secondDice = diceNum.nextInt(6) + 1;

        while(firstDice != secondDice){
            System.out.println("Roll #1: " + firstDice);
            System.out.println("Roll #2: " + secondDice);
            int sum = firstDice + secondDice;
            System.out.println("The total is " + sum + "!");
            System.out.println();

            int diceRoll3 = diceNum.nextInt(6);
            int diceRoll4 = diceNum.nextInt(6);
            firstDice = diceRoll3;
            secondDice = diceRoll4;
        }
        System.out.println();
        System.out.println("Roll #1: " + firstDice);
        System.out.println("Roll #2: " + secondDice);
        System.out.println("The total is " + (firstSum) + "!");
    }
}
