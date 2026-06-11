import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string");
		   String a = in.nextLine();
			
		System.out.println("Enter the uppercase");
			String b = in.nextLine();

    	System.out.println("Enter the lowercase");
    		String c = in.nextLine();


	
		String lowercase = b.toLowerCase();
		String uppercase = c.toUpperCase();
		System.out.println("Length =" +a.length());
		System.out.println("lowercase =" +lowercase);
		System.out.println("uppercase =" +uppercase);
	}
}

        
       
 