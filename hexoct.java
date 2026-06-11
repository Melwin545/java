import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter hex: ");
        String hex = sc.nextLine().toUpperCase();
        
        String octal = "";
        
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int num;
            
            if (ch >= '0' && ch <= '9') {
                num = ch - '0';
            }
            else if (ch >= 'A' && ch <= 'F') {
                num = ch - 'A' + 10;
            }
            else {
                System.out.println("Wrong character!");
                return;
            }
            
            int first  = num / 8;          
            int second = (num / 1) % 8;    
            int third  = num % 8;          
            
            octal = octal + first;
            octal = octal + second;
            octal = octal + third;
        }
        
        while (octal.length() > 1 && octal.charAt(0) == '0') {
            octal = octal.substring(1);
        }
        
        System.out.println("Hex  : " + hex);
        System.out.println("Octal: " + octal);
        
        sc.close();
    }
}