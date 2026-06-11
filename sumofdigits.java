import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();
        
       int sum=0;
       int temp=num;
       
       while(temp>0)
       {
           sum=sum+(temp%10);
           temp=temp/10;
           
       }
       System.out.println("Sum of digits:" +sum);
    
        in.close();
    }
}