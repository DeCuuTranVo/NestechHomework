/*
 33. Viết chương trình JavaScript/Java để kiểm tra xem 
 hai số có nằm trong khoảng 40..60 hoặc 70..100 hay không.
 */

public class Problem33 {
    private static boolean checkNum(int a, int b) {
        boolean aIn = ((40 <= a) && (a <= 60)) || ((70 <= a) && (a <= 100));
        boolean bIn = ((40 <= b) && (b <= 60)) || ((70 <= b) && (b <= 100));
        return (aIn && bIn);
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean withInRange = checkNum(a, b);
        System.out.println(withInRange);    
    }
}
