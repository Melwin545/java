import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] m = new int[r][c];
        System.out.println("Enter " + r + "×" + c + " elements:");
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();

        System.out.println("\nOriginal Matrix:");
        print(m);

        System.out.print("\nWhich row (0 to " + (r-1) + "): ");
        int row = sc.nextInt();

        if(row < 0 || row >= r) {
            System.out.println("Invalid row!");
            sc.close();
            return;
        }

        System.out.print("How many times? ");
        int t = sc.nextInt();
        System.out.print("left or right: ");
        boolean left = sc.next().trim().toLowerCase().equals("left");

        rotate(m, row, t % c, left, c);

        System.out.println("\nAfter rotation:");
        print(m);

        sc.close();
    }

    static void rotate(int[][] m, int row, int t, boolean left, int c) {
        if(t == 0) return;
        int[] tmp = new int[c];
        for(int j = 0; j < c; j++) tmp[j] = m[row][j];

        if(left) {
            for(int j = 0; j < c; j++)
                m[row][j] = tmp[(j + t) % c];
        } else {
            for(int j = 0; j < c; j++)
                m[row][j] = tmp[(j - t + c) % c];
        }
    }

    static void print(int[][] m) {
        for(int[] row : m) {
            for(int v : row)
                System.out.print(v + "\t");
            System.out.println();
        }
    }
}