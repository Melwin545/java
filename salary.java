import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int score;
	    double salary;
	    Scanner in =new Scanner(System.in);
		System.out.println("Enter your current salary");
		salary=in.nextDouble();
		System.out.println("Enter your performance score");
		score=in.nextInt();
		
		if(score<=60){
		    salary=salary+(salary*5/100);
		    System.out.println("5% hike new salary" +salary);
		}else if(score<=70) {
		    salary=salary+(salary*8/100);
		    System.out.println("8% hike new salary" +salary);
		}else if(score<=80){
		    salary=salary+(salary*12/100);
		    System.out.println("12% hike new salary" +salary);
		}else if(score<=90){
		    salary=salary+(salary*15/100);
		    System.out.println("5% hike new salary" +salary);
		}else{
		    System.out.println("salary is same" +salary);
		}
		in.close();
	}
}