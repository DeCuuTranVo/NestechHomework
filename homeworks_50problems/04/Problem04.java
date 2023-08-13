public class Problem04 {
    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double c = 7;

        // calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(area);
    }
}
