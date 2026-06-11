import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = new int[3];

        for(int i=0;i<3;i++) a[i]=sc.nextInt();
        for(int i=0;i<3;i++) b[i]=sc.nextInt();
        for(int i=0;i<3;i++) c[i]=sc.nextInt();

        for(int i=0;i<3;i++) System.out.print(a[i]+" ");
        System.out.println();

        for(int i=0;i<3;i++) System.out.print(b[i]+" ");
        System.out.println();

        for(int i=0;i<3;i++) System.out.print(c[i]+" ");
    }
}