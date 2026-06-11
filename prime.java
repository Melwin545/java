import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        while (i < num) {      
            if (num % i == 0) { 
                isPrime = false;
                break;
            }
            i++;
        }

        if (num <= 1) {
            System.out.println(num + " is not prime.");
        } else if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }

        sc.close();
    }
}
