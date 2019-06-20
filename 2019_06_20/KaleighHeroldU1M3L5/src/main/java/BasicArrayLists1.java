import java.util.ArrayList;
import java.util.List;

public class BasicArrayLists1 {
        public static void main(String[] args) {
            List<Integer> integerList = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                integerList.add(-133);
            }

            for(int i = 0; i < integerList.size(); i++) {
                System.out.println("Slot " + i + " contains a " + integerList.get(i));

        }
    }

}
