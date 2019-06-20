import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {

        List<Integer> whateverYourArrayListVariableIsCalled = new ArrayList<>();
        Random random = new Random();
        int randomNums;

        for(int i = 0; i < 10; i++) {
            randomNums = random.nextInt(100) + 1;
            whateverYourArrayListVariableIsCalled.add(randomNums);
        }

        System.out.println("ArrayList: " + whateverYourArrayListVariableIsCalled);
    }
}
