import java.util.List;

public class Review {
    public int[] increment(int[] arr) {
        for(int i = 0; i < arr.length;) {
            arr[i] = arr[i] + 1;
        }
        return arr;
    }

    public String hiLo(double num) {
        String str = "";
        if(num > 10) {
            str = "Hi";
        } else if(num < 10) {
            str = "Lo";
        } else {
            str = "Perfect";
        }


        return str;
    }

    public List<Integer> mutateList(List<Integer> numbers) {

        //
        int x = numbers.get(numbers.size() - 1);

        // increment last ele +1
        numbers.set(numbers.size() - 1, x + 1);


        // append 4 to end of list
        numbers.add(4);

        // set second element to 3
        numbers.set(1, 3);

        return numbers;
    }

    Public class Apple extends Fruit {
        public void mature() {
            int currAge = getAge();

            setAge(currAge + 2);
        }
    }

}
