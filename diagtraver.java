import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] m = new int[n][n];

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = sc.nextInt();

        System.out.println("Output:");

        for (int d = 0; d <= 2*(n-1); d++) {

            if (d % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    int j = d - i;
                    if (i < n && j >= 0 && j < n)
                        System.out.print(m[i][j] + " ");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    int j = d - i;
                    if (i >= 0 && j >= 0 && j < n)
                        System.out.print(m[i][j] + " ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
