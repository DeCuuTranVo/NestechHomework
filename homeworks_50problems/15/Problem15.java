import java.util.Scanner;

public class Problem15 {

    public static int Compute(int pNumber) {
        if (pNumber <= 13) {
            return (13 - pNumber);
        } else {
            return Math.abs(13 - pNumber) * 2;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = scan.nextInt();

        int result = Compute(a);
        System.out.println(result);
        scan.close();
    }
}
