
public class Main
{
	public static void main(String[] args) {
	    
	    try{
	       int [] arr = {2, 23, 98 ,8 ,6};
	      
	        
	        System.out.println(arr[7]);
	    } 
	        catch(ArrayIndexOutOfBoundsException e){
	            System.out.println("Use numbers within the index");
	       
	    }
	}
}