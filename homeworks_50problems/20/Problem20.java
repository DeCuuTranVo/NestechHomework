/*
20. Viết chương trình JavaScript/Java để kiểm tra hai số nguyên đã cho 
xem một số nguyên dương và một số nguyên âm.
*/

import java.util.Scanner;

public class Problem20 {
    public static boolean checkPosNev(int a, int b) {
        if ((a > 0) && (b < 0)) {
            return true; 
        } else if ((a < 0) && (b > 0)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scan.nextInt();

        System.out.println("Input second number: ");
        int b = scan.nextInt();

        boolean result = checkPosNev(a, b);
        System.out.println(result);
        scan.close();
    } 
}
