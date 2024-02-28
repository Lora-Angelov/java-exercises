package best_practices;
import java.util.Scanner;
import static java.lang.Math.floor;

public class YearDescriber {

    static Scanner fromUser = new Scanner(System.in);

    private YearDescriber(){};

    public static void describeYear() {

        int year = readYear();

        String leapYearMessage = isLeapYear(year) ? "a leap year," : "not a leap year,";
        String startDayMessage = getStartDay(year) + "!";
        System.out.println(year + " was" + leapYearMessage + startDayMessage); 
    }

    private static readYear() {
        System.out.println("What year would you like to learn about?");
    while(true) {
        try {
            return fromUser.nextInt();
        } catch (Exception e) {
            System.out.println("Please just input a year in the format YYYY!");
            fromUser.next();
            }
        }
    }
        

    private static boolean isLeapYear(int year) {
        return (year%4 == 0 && year%100 !== 0) || (year%400 == 0);
    }


    private static String getStartDay(int year) {
        int startDay = (1 + (int)floor((2.6*11) -0.2) - (2*(year/100)) + ((year%100)-1) + (int)floor((double)((year%100)-1) / 4) + (int)floor((double)(year/100) / 4));
        startDay = (startDay % 7 + 7) % 7;

        String[] daysOfWeek {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            return daysOfWeek[startDay];
        }
    }
}
