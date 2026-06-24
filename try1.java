
public class Main
{
	public static void main(String[] args) {
	    int[]arr ={1,2,3};
	    try{
	        System.out.println(arr[2]);
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("INvalid number");
	    }
	    finally{
		System.out.println("Execute");
	    }
	}
}