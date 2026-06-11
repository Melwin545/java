import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];
        
        System.out.println("Enter 4 numbers for A:");
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++)
                A[i][j] = sc.nextInt();
                
        System.out.println("Enter 4 numbers for B:");
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++)
                B[i][j] = sc.nextInt();
                
        for(int i=0; i<2; i++)
            for(int j=0; j<2; j++)
                C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j];
                
        System.out.println("Result:");
        for(int i=0; i<2; i++) {
            System.out.println(C[i][0] + " " + C[i][1]);
        }
        
        sc.close();
    }
}