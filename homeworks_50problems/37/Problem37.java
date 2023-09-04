/*
 37. Viết chương trình JavaScript/Java để tạo một chuỗi mới có 3 ký tự đầu tiên
  viết thường từ một chuỗi đã cho. Nếu độ dài chuỗi nhỏ hơn 3, hãy chuyển đổi 
  tất cả các ký tự thành chữ hoa.
 */
public class Problem37 {
    public static String convertCase(String pInputString) {
        if (pInputString.length() < 3) {
            return pInputString.toUpperCase();
        } else {
            return pInputString.substring(0, 3).toLowerCase() + pInputString.substring(3);
        }
    }

    public static void main(String[] args) {
        String inputString = args[0];
        System.out.println(convertCase(inputString));
    }
}
