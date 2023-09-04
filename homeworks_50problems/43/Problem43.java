/*
 * 43. Viết chương trình JavaScript/Java để kiểm tra trong ba số đã cho 
 * (số nguyên không âm) xem có hai hoặc tất cả các số đó có chữ số ngoài 
 * cùng bên phải giống nhau không.
 */

 public class Problem43 {
    private static String checkSimilarLastDigits(int a, int b, int c) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        if ((lastDigitA == lastDigitB) && 
            (lastDigitB == lastDigitC) && 
            (lastDigitA == lastDigitB)) {
            return "Three similar";
        } else if ((lastDigitA == lastDigitB) || 
            (lastDigitB == lastDigitC) ||
            (lastDigitA == lastDigitB)) {
            return "Two similar";
        } else {
            return "No similar";
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        String result = checkSimilarLastDigits(a, b, c);
        System.out.println(result);
    }
}