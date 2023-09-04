/*
 40. Viết chương trình JavaScript/Java để kiểm tra từ hai số nguyên đã cho xem một trong 
 số chúng là 8 hay tổng hoặc hiệu của chúng là 8.
 */

public class Problem40 {
    private static boolean checkNum(int a, int b) {
        if ((a == 8) || (b == 8) || (a+b == 8) || (Math.abs(a-b) == 8)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean result = checkNum(a, b);
        System.out.println(result);
    }
}