import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scan.nextInt();
        boolean leap = false;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leap = true;
        }

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}