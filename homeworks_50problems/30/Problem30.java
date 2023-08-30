/*
 30. Viết chương trình JavaScript/Java để kiểm tra xem một chuỗi "Script" 
 có xuất hiện ở vị trí thứ 5 (chỉ số 4) trong một chuỗi đã cho hay không. 
 Nếu "Script" xuất hiện trong chuỗi, trả lại chuỗi không có "Script" 
 nếu không trả lại chuỗi gốc.
 */
public class Problem30 {

    public static String checkString(String pInputString) {
        if (pInputString.length() < 5) {
            return pInputString;
        }

        if (pInputString.length() < 5 + "Script".length()) {
            if (pInputString.substring(4).compareTo("Script") == 0) {
                return pInputString.replace("Script", "");
            } else {
                return pInputString;
            }          
        } 
        else 
        {
            if (pInputString.substring(4, 4 + "Script".length()).compareTo("Script") == 0) {
                return pInputString.replace("Script", "");
            } else {
                return pInputString;
            }
        } 
    }

    public static void main(String[] args) {
        String inputString = args[0];
        String outputString = checkString(inputString);
        System.out.println(outputString);
        
    }
}
