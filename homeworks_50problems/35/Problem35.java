/*
 35. Viết chương trình kiểm tra xem một ký tự xác định có tồn tại giữa 
 vị trí thứ 2 và thứ 4 trong một chuỗi cho trước hay không.
 */

public class Problem35 {

    public static boolean checkContainRange(String pInputString, char c) {
        if (pInputString.length() < 3) {
            return false; // string too short to check
        }

        if ((pInputString.charAt(1) == c)||
            (pInputString.charAt(2) == c)
        ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String inputString = args[0];
        char inputChar = args[1].charAt(0);
        System.out.println(checkContainRange(inputString, inputChar));
    }
}
