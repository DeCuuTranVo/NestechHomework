/*
 34. Viết chương trình JavaScript/Java tìm số lớn nhất trong hai số nguyên dương 
 đã cho. Hai số nằm trong khoảng 40..60.
 */

public class Problem34 {
    private static int checkNumAndMax(int a, int b) {
        boolean aIn = ((40 <= a) && (a <= 60));
        boolean bIn = ((40 <= b) && (b <= 60));

        if (aIn && bIn) {
            return Math.max(a, b);
        } else if (aIn && !bIn) {
            return a;
        } else if (!aIn && bIn) {
            return b;
        } else { // !aIn && !bIn
            return -1;
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int maxNum = checkNumAndMax(a, b);
        if (maxNum == -1) {
            System.out.println("Either a nor b are in range [40,60]");
        } else {
            System.out.println("Max and within-ranged number: " + maxNum);
        }
    }
}
