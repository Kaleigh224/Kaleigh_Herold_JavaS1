import java.util.*;

public class DiceDoubles {
    public static void main(String[] args) {
        System.out.println();
        Random diceRoll = new Random();
        int x = diceRoll.nextInt(6) + 1;

        int firstRoll = diceRoll.nextInt(6) + 1;
        System.out.println("Roll #1: " + firstRoll);
        System.out.println();

        int secondRoll = diceRoll.nextInt(6) + 1;
        System.out.println("Roll #2: " + secondRoll);


        for(int i = 1; i < 0; i++) {
            int doublesRoll = i;
            if(firstRoll != secondRoll){
                doublesRoll++;
            }else{
                System.out.println(firstRoll);
                System.out.println((secondRoll));
            }
        }
    }
}
