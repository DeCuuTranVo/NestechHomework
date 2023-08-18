import java.util.Calendar;

public class Problem09 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayOfYearCurrent = calendar.get(Calendar.DAY_OF_YEAR);

        calendar.set(calendar.get(Calendar.YEAR), 11, 25);
        int dayOfYearChristmax = calendar.get(Calendar.DAY_OF_YEAR);

        int dayDuration = Math.abs(dayOfYearChristmax - dayOfYearCurrent);
        System.out.println("Duration till Christmax: " + dayDuration + " days.");
    }
}
