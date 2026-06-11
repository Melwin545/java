import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int units;
        double bill;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter units consumed:");
        units = in.nextInt();

        if (units <= 100) {
            bill = units * 1;
        } else if (units <= 200) {
            bill = units * 2;
        } else if (units <= 300) {
            bill = units * 3;
        } else {
            bill = units * 5;
        }

        System.out.println("Your electricity bill is: ₹" + bill);

        in.close();
    }
}
