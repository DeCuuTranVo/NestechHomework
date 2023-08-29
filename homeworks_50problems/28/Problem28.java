/*
 28. Viết chương trình JavaScript/Java để kiểm tra xem 
 hai giá trị số nguyên đã cho có nằm trong khoảng 50..99 (bao gồm cả) hay không. 
 Trả về true nếu một trong số chúng nằm trong phạm vi.
 */

public class Problem28 {

    private static boolean checkNum(int a, int b) {
        boolean aIn = (50 <= a) && (a <= 99);
        boolean bIn = (50 <= b) && (b <= 99);
        return aIn || bIn;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean withInRange = checkNum(a, b);
        System.out.println(withInRange);    
    }
}
