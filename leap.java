import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a year:");
        year = in.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " might be a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        in.close();
    }
}
