public class Main
{
	static void j(int i) {
	if(i==0)
	return ;
		System.out.println("start " +i);
		j(i-1);
		System.out.println("End " +i);
	}
	public static void main(String []args){
	    j(5);
	}
}
