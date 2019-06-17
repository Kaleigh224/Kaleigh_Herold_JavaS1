import java.util.*;

public class BabyNimAkaTheEmptyPiles {
    public static void main(String[] args) {
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;


         do {
//            int newPile;

            Scanner myScanner = new Scanner(System.in);
            System.out.println("A:" + pileA +  "    B:" + pileB +  "    C:" + pileC);
            System.out.println();
            System.out.print("Choose a pile: ");
            String userChoice = myScanner.nextLine();
            System.out.println();
            System.out.print("How many to remove from pile " + userChoice + ": ");
            int userNumber = myScanner.nextInt();

            if(userChoice .equals("A")) {
                pileA = pileA - userNumber;
            }else if(userChoice .equals("B")) {
                pileB = pileB - userNumber;
            }else {
                pileC = pileC - userNumber;
            }

//            int newPile = pileA - userNumber;

        } while (pileA != 0 || pileB != 0 || pileC != 0);

    }
}
