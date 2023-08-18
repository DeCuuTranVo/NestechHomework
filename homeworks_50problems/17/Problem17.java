/*
17. Viết chương trình JavaScript/Java để tính chênh lệch tuyệt đối giữa một số đã chỉ định và 19. 
Trả về gấp ba lần chênh lệch tuyệt đối nếu số đã chỉ định lớn hơn 19.
*/

import java.util.Scanner;

public class Problem17 {
    public static int absDiff(int a) {
        if ( a <= 19) {
            return Math.abs(a - 19); 
        } else {
            return Math.abs(a - 19)  *3;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scan.nextInt();

        int result = absDiff(a);
        System.out.println(result);
        scan.close();
    }   
}
