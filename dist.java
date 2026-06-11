import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double percentage, attendance;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter percentage marks:");
        percentage = in.nextDouble();

        System.out.println("Enter attendance percentage:");
        attendance = in.nextDouble();

        if (percentage >= 85 && attendance >= 90) {
            System.out.println("Distinction");
        } else if (percentage >= 70 && attendance >= 80) {
            System.out.println("First Class");
        } else if (percentage >= 60 && attendance >= 75) {
            System.out.println("Second Class");
        } else if (percentage >= 50 && attendance >= 75) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        in.close();
    }
}
