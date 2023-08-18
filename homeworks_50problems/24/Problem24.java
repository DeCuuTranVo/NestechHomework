/*
24. Viết chương trình JavaScript/Java để tạo một chuỗi khác
 từ một chuỗi đã cho có thêm ký tự đầu tiên của chuỗi đã cho vào trước và sau.
*/

import java.util.Scanner;

public class Problem24 {
    public static String appendStringFrontBack(String pString) {
         if (pString.length() == 0) {
            return pString;
        } else {
            String firstChar = pString.substring(0, 1);
            return firstChar + pString + firstChar;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String givenString = scan.nextLine();

        String result =  appendStringFrontBack(givenString);
        System.out.println(result);
        scan.close();
    }   
}
