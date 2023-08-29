/*
    26. Viết chương trình JavaScript/Java để tạo một chuỗi từ một chuỗi cho trước. 
    Điều này được thực hiện bằng cách lấy 3 ký tự cuối cùng và thêm chúng ở cả phía trước và phía sau. 
    Độ dài chuỗi phải từ 3 trở lên.
*/

public class Problem26 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string in command line");
        }

        String inputString = args[0];
        if (inputString.length() <= 2) {
            System.out.println("Input string length must be >= 3");
        }

        String prime = inputString.substring(inputString.length()-3, inputString.length());
        String outputString = prime + inputString + prime;
        System.out.println(outputString);
    }
}
