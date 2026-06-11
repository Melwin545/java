import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][][] arr = new int[layers][rows][cols];

        System.out.println("Enter " + (layers * rows * cols) + " elements:");
        for (int k = 0; k < layers; k++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[k][i][j] = sc.nextInt();
                }
            }
        }

        int[] colSum = new int[cols];

        for (int k = 0; k < layers; k++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    colSum[j] += arr[k][i][j];
                }
            }
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            System.out.println("Column " + j + ": " + colSum[j]);
        }

        sc.close();
    }
}