/*
 29. Viết chương trình JavaScript/Java để kiểm tra xem ba giá trị số nguyên 
 đã cho có nằm trong khoảng 50..99 (bao gồm cả) hay không. 
 Trả về true nếu một hoặc nhiều trong số chúng nằm trong phạm vi đã chỉ định.
 */

public class Problem29 {
    private static boolean checkNum(int a, int b, int c) {
        boolean aIn = (50 <= a) && (a <= 99);
        boolean bIn = (50 <= b) && (b <= 99);
        boolean cIn = (50 <= c) && (c <= 99);
        return aIn || bIn || cIn;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean withInRange = checkNum(a, b, c);
        System.out.println(withInRange);    
    }
}
