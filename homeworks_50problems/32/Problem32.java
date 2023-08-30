/*
 32. Viết chương trình JavaScript/Java để tìm 
 giá trị gần nhất với 100 từ hai giá trị số.
 */
public class Problem32 {
    private static int near100(int a, int b) {
        int distanceA = Math.abs(a - 100);
        int distanceB = Math.abs(b - 100);
        if (distanceA < distanceB) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int near100Num = near100(a, b);
        System.out.println(near100Num);    
    }
}
