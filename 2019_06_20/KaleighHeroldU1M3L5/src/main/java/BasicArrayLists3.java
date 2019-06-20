import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists3 {
    public static void main(String[] args) {
        List<Integer> whateverYourArrayListVariableIsCalled = new ArrayList<>();
        Random randomNumGenerator = new Random();
        int randomNum;

        for(int i = 0; i < 1000; i++) {
            randomNum = randomNumGenerator.nextInt(99) + 10;
            whateverYourArrayListVariableIsCalled.add(randomNum);
        }
        System.out.println(whateverYourArrayListVariableIsCalled);
    }
}
