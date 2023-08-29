/*
 27. Viết chương trình JavaScript/Java để kiểm tra xem 
 một chuỗi có bắt đầu bằng 'Java' hay không nếu ngược lại.
 */


public class Problem27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string in command line");
        }

        String inputString = args[0];
        if (inputString.startsWith("Java")){
            System.out.println("This string starts with Java");
        } else {
            System.out.println("This string does not start with Java");
        }
    }
}
