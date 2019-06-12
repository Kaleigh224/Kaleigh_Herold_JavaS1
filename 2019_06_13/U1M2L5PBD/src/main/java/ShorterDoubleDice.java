import java.util.Random;

public class ShorterDoubleDice {
    public static void main(String[] args) throws Exception
    {


        System.out.println();
        Random diceRoll = new Random();
        int secondRoll;
        int firstRoll;

        do {
            firstRoll = diceRoll.nextInt(6) + 1;
            System.out.println("Roll #1: " + firstRoll);
            secondRoll = diceRoll.nextInt(6) + 1;
            System.out.println("Roll #2: " + secondRoll);
            Thread.sleep(200);
            System.out.println();
        } while (firstRoll != secondRoll);
    }
}
