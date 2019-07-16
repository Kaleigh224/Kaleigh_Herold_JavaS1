public class ArrayList implements List{

    private int size;
    private int[] numbers;

    public ArrayList() {
        this.size = 0;
        this.numbers = new int[10];
    }

    @Override
    public void add(int element) {
        numbers[size] = element;
        size++;
    }

    @Override
    public int get(int index) {
        return numbers[index];
    }

    @Override
    public int set(int index, int element) {
        numbers[index] = element;
    }

    @Override
    public int size() {
        return size;
    }


}
