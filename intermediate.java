import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int rem = temp % 10; // get last digit
            sum += rem;           // add to sum
            System.out.println("n = " + temp + " rem = " + rem + " sum = " + sum);
            temp = temp / 10;     // remove last digit
        }

        System.out.println("Total sum of digits = " + sum);

        in.close();
    }
}
