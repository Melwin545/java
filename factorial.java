import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int temp = n;
        int factorial = 1;

        while (temp > 0) {
            factorial = factorial * temp;
            temp = temp - 1;
        }

        System.out.println(n + " = " + factorial);

        in.close();
    }
}
