import java.util.Calendar;
import java.util.Scanner;

public class Problem07 {
    public static boolean isSunday(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, 0, 1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek == Calendar.SUNDAY;
    }

    public static void main(String[] args) {
        int yearStart = 2014;
        int yearEnd = 2050;

        for (int year = yearStart; year <= yearEnd; year++) {
            if (isSunday(year)) {
                System.out.println("1st January is a Sunday  "+year);
            } else {
                System.out.println("1st January is not a Sunday  "+year);
            }
        }
    }
}
