import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args) {
        List<Integer> arrListOne = new ArrayList<>();
        List<Integer> arrListTwo = new ArrayList<>();
        Random randNumGen = new Random();
        int randomNum;

        for(int i = 0; i < 10; i++) {
            randomNum = randNumGen.nextInt(100) + 1;
            arrListOne.add(randomNum);
            arrListTwo.add(randomNum);
        }

        arrListOne.set(9, -7);
        System.out.println(arrListOne);
        System.out.println(arrListTwo);
    }
}
