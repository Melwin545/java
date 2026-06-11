import java.util.Scanner;

public class Triangleperi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for three sides
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        // Calculate perimeter
        double perimeter = a + b + c;

        // Print the perimeter
        System.out.println("Perimeter of triangle = " + perimeter);

        sc.close();
    }
}
