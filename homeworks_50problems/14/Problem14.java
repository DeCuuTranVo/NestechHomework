import java.util.Scanner;

class Problem14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a filename: ");
        String fileName = scan.nextLine();
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
        System.out.println("File extension is " + extension);
        scan.close();
    }
}