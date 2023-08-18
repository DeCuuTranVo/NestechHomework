import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 10;
        int randNum = rand.nextInt(upperbound) + 1;
     
        while (true) {            
            System.out.println("Please enter a number between 1 and 10: ");
            int guessNum = scan.nextInt();
            if (guessNum == randNum) {
                System.out.println("Good job!");
                break;
            } else {
                System.out.println("Bad guess!");
            }
        }
    }
}
