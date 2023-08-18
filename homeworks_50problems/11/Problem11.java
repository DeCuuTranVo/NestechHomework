import java.util.Scanner;

public class Problem11 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Celcius Degree: ");
        double celsius = scan.nextDouble();
        System.out.println(celsius + " Celcius degree is " + celsiusToFahrenheit(celsius) + " Fahrenheit degree");

        System.out.print("Enter Fahrenheit Degree: ");
        double fahrenheit = scan.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit degree is " + fahrenheitToCelsius(fahrenheit) + " Celcius degree");
    }
}
