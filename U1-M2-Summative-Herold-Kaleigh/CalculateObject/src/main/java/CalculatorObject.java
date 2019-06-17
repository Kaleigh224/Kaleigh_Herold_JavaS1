public class CalculatorObject {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        System.out.println("1 + 1 = " + calculate.intAddition(1, 1));
        System.out.println("23 - 52 = " + calculate.intSubtraction(23, 52));
        System.out.println("34 * 2 = " + calculate.intMultiplication(34, 2));
        System.out.println("12 / 3 = " + calculate.intDivision(12, 3));
        System.out.println("12 / 7 = " + calculate.intDivision(12, 7));
        System.out.println("3.4 + 2.3 = " + calculate.doubleAddition(3.4, 2.3));
        System.out.println("6.7  * 4.4 = " + calculate.doubleMultiplication(6.7, 4.4));
        System.out.println("5.5 - 0.5 = " + calculate.doubleSubtraction(5.5, 0.5));
        System.out.println("10.8 / 2.2 = " + calculate.doubleDivision(10.8, 2.2));
    }
}
