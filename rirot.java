import java.util.Scanner;

public class RowRotation {
    
    public static void rotateLeft(int[] row, int k) {
        int n = row.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = row[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            row[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter base rotation value: ");
        int baseRotation = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            rotateLeft(arr[i], i * baseRotation);
        }

        System.out.println("Matrix after rotation:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
