/*
18. Viết chương trình JavaScript/Java để kiểm tra một cặp số và 
trả về true nếu một trong các số là 50 hoặc nếu tổng của chúng là 50.
*/

import java.util.Scanner;

public class Problem18 {
    public static boolean check50(int a, int b) {
        if ( (a == 50) || (b == 50)) {
            return true; 
        } else if ((a+b) == 50){
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

        boolean result = check50(a, b);
        System.out.println(result);
        scan.close();
    }   
}
