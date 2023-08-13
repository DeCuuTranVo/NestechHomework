
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class Problem01 {
    public static void main(String[] args) {
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        //System.out.println(currentDateTime);
        String dayOfWeek = currentDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
        System.out.println("Today is: " + dayOfWeek);

        int hour = currentDateTime.getHour();
        int minute = currentDateTime.getMinute();
        int second = currentDateTime.getSecond();
        String ampm;

        if (hour == 0) {
            hour += 12;
            ampm = "AM";
        } else if ((1 <= hour) && (hour <= 11)){
            ampm = "AM";
        } else if (hour == 12) {
            ampm = "PM";
        } else {
            hour -= 12;
            ampm = "PM";
        }
        String time = String.format("%02d:%02d:%02d %s", hour, minute, second, ampm);
        System.out.println("Current Time is: " + time);
    }
}

/*
    Today is: Sunday
    Current Time is: 05:03:24 PM
*/