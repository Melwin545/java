import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        int[][] a = new int[3][];
        int r, c;

        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();

        for (int i = 0; i < r; i++) {
            System.out.println("Enter c:");
            c = sc.nextInt();
            a[i] = new int[c];

            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
