/*
 39. Viết chương trình JavaScript/Java để tính tổng của hai số nguyên đã cho. 
 Nếu tổng nằm trong phạm vi 50..80 trả về 65 nếu không thì trả về 80.
 */

public class Problem39 {
    private static int checkSum(int a, int b) {
        int sum = a + b;
        if ((50 <= sum) && (sum <= 80)) {
            return 65;
        } else {
            return 80;
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = checkSum(a, b);
        System.out.println(sum);
    }
}
