import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++)
            { System.out.print("*");
            } System.out.println();
        }
    }}
