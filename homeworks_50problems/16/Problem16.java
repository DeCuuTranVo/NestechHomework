import java.util.Scanner;

public class Problem16 {
    public static int strangeSum(int a, int b) {
        if ( a != b) {
            return a + b; 
        } else {
            return (a + b) *3;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scan.nextInt();

        System.out.println("Input second number: ");
        int b = scan.nextInt();

        int result = strangeSum(a, b);
        System.out.println(result);
        scan.close();
    }   
}
