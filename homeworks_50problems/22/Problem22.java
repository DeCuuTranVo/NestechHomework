/*
22. Viết chương trình JavaScript/Java để 
xóa một ký tự ở vị trí xác định trong 
một chuỗi đã cho và trả về chuỗi đã sửa.
 */

import java.util.Scanner;

public class Problem22 {
    public static String deleteIndex(String pString, int index) {
        if ((index < 0) || (index >= pString.length())) {
            throw new ArrayIndexOutOfBoundsException("Index exceeds string length");
        }

        StringBuilder sb = new StringBuilder(pString);
        sb.deleteCharAt(index);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String givenString = scan.nextLine();

        System.out.println("Input index: ");
        int givenIndex = scan.nextInt();

        String result = deleteIndex(givenString, givenIndex);
        System.out.println(result);
        scan.close();
    }   
}
