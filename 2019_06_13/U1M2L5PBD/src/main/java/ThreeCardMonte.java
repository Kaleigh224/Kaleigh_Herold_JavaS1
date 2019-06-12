import java.util.*;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random cup = new Random();
        int computerCard = cup.nextInt(3) + 1;

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of the corner of his eye and starts shuffling");
        System.out.println("He lays down three cards.");
        System.out.println();
        System.out.println("Which one is the ace?");
        System.out.println();
        System.out.println("## ## ##");
        System.out.println("## ## ##");
        System.out.println("1  2  3");

        int userGuess = myScanner.nextInt();
        switch (computerCard) {
            case 1:
              if(userGuess == computerCard) {
                  System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                  System.out.println("AA ## ##");
                  System.out.println("AA ## ##");
                  System.out.println("1  2  3");
              }else{
                  System.out.println("Ha! Fast Eddie wins again! The ace was card number 1.");
                  System.out.println("AA ## ##");
                  System.out.println("AA ## ##");
                  System.out.println("1  2  3");
              }
              break;
            case 2:
                if(userGuess == computerCard) {
                    System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                    System.out.println("## AA ##");
                    System.out.println("## AA ##");
                    System.out.println("1  2  3");
                }else{
                    System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.");
                    System.out.println("## AA ##");
                    System.out.println("## AA ##");
                    System.out.println("1  2  3");
                }
                break;
            case 3:
                if(userGuess == computerCard) {
                    System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
                    System.out.println("## ## AA");
                    System.out.println("## ## AA");
                    System.out.println("1  2  3");
                }else{
                    System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.");
                    System.out.println("## ## AA");
                    System.out.println("## ## AA");
                    System.out.println("1  2  3");
                }
                break;
        }


    }
}
