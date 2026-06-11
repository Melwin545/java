import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int marks;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your marks:");
        marks = in.nextInt();

        if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        in.close();
    }
}
