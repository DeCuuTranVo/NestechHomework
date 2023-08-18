/*
21. Viết chương trình JavaScript/Java để tạo một chuỗi khác bằng cách thêm "Py" 
vào trước một chuỗi đã cho. Nếu chuỗi đã cho bắt đầu bằng "Py" hãy trả về chuỗi gốc.
*/
import java.util.Scanner;

public class Problem21 {
    public static String pyString(String pString) {
        if (pString.startsWith("Py")) {
            return pString; 
        } else {
            return "Py" + pString;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string: ");
        String a = scan.nextLine();

        String result = pyString(a);
        System.out.println(result);
        scan.close();
    }   
}