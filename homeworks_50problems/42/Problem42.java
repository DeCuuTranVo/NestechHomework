/*
42. Viết chương trình JavaScript/Java để kiểm tra xem ba số đã 
cho đang tăng theo strict hoặc soft mode.  
Lưu ý: strict mode -> 10, 15, 31 : soft mode -> 24, 22, 31 hoặc 22, 22, 31
 */

 public class Problem42 {
    private static String checkIncrement(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            return "Strict Mode";
        } else if (a < c) {
            return "Soft Mode";
        } else {
            return "Not Increase";
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        String result = checkIncrement(a, b, c);
        System.out.println(result);
    }
}