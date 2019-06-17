import java.util.*;

public class Nim {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int pileA = 3;
        int pileB = 4;
        int pileC = 5;

        System.out.print("Player 1, enter your name: ");
        String player1 = myScanner.nextLine();

        System.out.print("Player 2, enter your name: ");
        String player2 = myScanner.nextLine();


        while (pileA != 0 || pileB != 0 || pileC != 0) {

            System.out.println("A:" + pileA + "    B:" + pileB + "    C:" + pileC);
            System.out.println();

            System.out.print(player1 + " choose a pile: ");
            String user1Choice = myScanner.nextLine();
            System.out.print("How many to remove from pile " + user1Choice + ": ");
            int player1Number = myScanner.nextInt();
            myScanner.nextLine();


            if(user1Choice.equals("A")) {
                pileA = pileA - player1Number;
            }else if(user1Choice .equals("B")) {
                pileB = pileB - player1Number;
            }else {
                pileC = pileC - player1Number;
            }
            if(pileA == 0 && pileB == 0 && pileC == 0) {
                System.out.println(player2 + ", there are no counters left, so you WIN!");
                break;
            }

            System.out.println("A:" + pileA +  "    B:" + pileB +  "    C:" + pileC);

            System.out.print(player2 + " choose a pile: ");
            String user2Choice = myScanner.nextLine();
            System.out.print("How many to remove from pile " + user2Choice + ": ");
            int player2Number = myScanner.nextInt();
            myScanner.nextLine();

            if(user2Choice.equals("A")) {
               pileA = pileA - player2Number;
            } else if(user2Choice.equals("B")) {
                pileB = pileB - player2Number;
            } else {
                pileC = pileC - player2Number;
            }
            if(pileA == 0 && pileB == 0 && pileC == 0) {
                System.out.println(player1 + ", there are no counters left, so you WIN!");
            }
        }
    }
}
