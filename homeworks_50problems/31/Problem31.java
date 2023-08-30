/*
 * 31. Viết chương trình JavaScript/Java tìm số lớn nhất trong ba số nguyên đã cho.
 */
public class Problem31 {
    private static int maxNum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int maxNum = maxNum(a, b, c);
        System.out.println(maxNum);    
    }
}
