/*
 * 25. Viết chương trình JavaScript/Java để kiểm tra xem một số dương đã cho là bội số của 3 hay 7.
 */

import java.util.Scanner;

/**
 * Problem25
 */
public class Problem25 {

    public static void main(String[] args) {
        Integer n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception ex) {
            System.out.println("Please input an integer");
            return;
        }
        
        if (n <= 0) {
            System.out.println("Please input a positive integer");
            return;
        }

        Boolean divisibleBy3 = (n % 3 == 0);
        Boolean divisibleBy7 = (n % 7 == 0);

        if (divisibleBy3) {
            System.out.println("This number is divisible by 3");
        }

        if (divisibleBy7) {
            System.out.println("This number is divisible by 7");
        }

        if ((!divisibleBy3) && (!divisibleBy7)) {
            System.out.println("This number is not divisible by 3 and 7");
        } 
    }
}