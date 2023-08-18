/*
23. Viết chương trình JavaScript/Java để tạo một chuỗi mới từ một chuỗi đã cho
 bằng cách thay đổi vị trí của ký tự đầu và ký tự cuối. 
 Độ dài chuỗi phải lớn hơn hoặc bằng 1.
*/
import java.util.Scanner;

public class Problem23 {
    public static String modifyStringOrder(String pString) {
        if (pString.length() < 1) {
            throw new ArrayIndexOutOfBoundsException("Index exceeds string length");
        } else if (pString.length() == 1) {
            return pString;
        } else {
            StringBuilder sb = new StringBuilder(pString);
            char temp = sb.charAt(0);
            sb.setCharAt(0, sb.charAt(sb.length()-1));
            sb.setCharAt(sb.length()-1, temp);
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String givenString = scan.nextLine();

        String result = modifyStringOrder(givenString);
        System.out.println(result);
        scan.close();
    }   
}
