/*
19. Viết chương trình JavaScript/Java để 
kiểm tra xem một số nguyên đã cho nằm trong khoảng 20 của 100 hay 400.
*/

import java.util.Scanner;

public class Problem19 {
    public static boolean checkWithInRange20(int a) {
        if (Math.abs(100 - a) <= 20) {
            return true; 
        } else if (Math.abs(400 - a) <= 20){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scan.nextInt();

        boolean result = checkWithInRange20(a);
        System.out.println(result);
        scan.close();
    }   
}
