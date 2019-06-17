import java.util.*;

public class ConverterApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();
        int userNumberMonth = 0;
        int userNumberDay = 0;


        while (userNumberMonth < 1 || userNumberMonth > 12) {
            System.out.println("Please enter a number between 1 and 12");
            userNumberMonth = myScanner.nextInt();
        }
        String monthIf = converterIf.convertMonth(userNumberMonth);
        String monthSwitch = converterSwitch.convertMonth(userNumberMonth);
        System.out.println(monthIf); // this will print the If statement logic
        System.out.println(monthSwitch); // this will print the Switch case

        while (userNumberDay < 1 || userNumberDay > 7) {
            System.out.println("Please enter a number between 1 and 7");
            userNumberDay = myScanner.nextInt();
        }
        String dayIf = converterIf.convertDay(userNumberDay);
        String daySwitch = converterSwitch.convertDay(userNumberDay);
        System.out.println(dayIf); // this will print the If statement
        System.out.println(daySwitch); // this will print the Switch case
    }
}
