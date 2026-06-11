public class Prime1to1000 {
    public static void main(String[] args) {
        int num = 2; 

        System.out.println("Prime numbers between 1 and 1000:");

        while (num <= 1000) {
            boolean isPrime = true;
            int i = 2;

            while (i * i <= num) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.print(num + " ");
            }

            num++;
        }
    }
}
