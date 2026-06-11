import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter decimal value: ");
        int dec = sc.nextInt();         
        
        String hex = "";

        while(dec > 0)        
        {
            int rem = dec % 8;
            if(rem < 10){
                hex = rem + hex;
            }
            else{
                hex = (char)((rem - 10) + 'A') + hex;
            }
            dec = dec / 8;
        }
        
        System.out.println("Octal  " + hex);
        
    }
}