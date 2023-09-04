/*
 * 41. Viết chương trình JavaScript/Java để kiểm tra một bộ ba số; 
 * nếu ba số giống nhau trả về 30; 
 * ngược lại trả về 20; 
 * và nếu hai số giống nhau trả về 40.
 */

 public class Problem41 {
    private static int checkSimilar(int a, int b, int c) {
        if ((a == b) && (b == c) && (c == a)) {
            return 30;
        } else if (((a == b))
                 || ((b == c))
                 || ((c == a))) {
            return 40;
        } else {
            return 20;
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int result = checkSimilar(a, b, c);
        System.out.println(result);
    }
}