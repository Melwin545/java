import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        n = in.nextInt();

        if ((n % 5 == 0) && (n % 7 == 0)) {
            System.out.println(n + " is divisible by 5 & 7");
        } else {
            System.out.println(n + " may not be divisible by 5 & 7");
        }

        in.close();
    }
}
