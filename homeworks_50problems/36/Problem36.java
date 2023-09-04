/*
 36. Viết chương trình JavaScript/Java kiểm tra xem chữ số cuối của 
 ba số nguyên dương có giống nhau hay không.
 */

public class Problem36 {
    private static boolean checkLastDigit(int a, int b, int c) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        if ((lastDigitA == lastDigitB) && 
            (lastDigitB == lastDigitC) && 
            (lastDigitC == lastDigitA)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean flag = checkLastDigit(a, b, c);
        System.out.println(flag);
        
    }
}
