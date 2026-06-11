import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter fibonacci series number");
		int n=sc.nextInt();
		
		int a=0,b=1,count=0;
		System.out.println("Fibonacci series");
		while(count<n){
		System.out.println(a+"");
		int next=a+b;
		a=b;
		b=next;
		count++;
		
	}
}
}