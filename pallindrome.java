
public class Main
{
	static boolean pallindrome(String str, int start, int end){
	    if(start>=end)
	    return true;    
	    
	    if(str.charAt(start)!=str.charAt(end))
	    return false;
	    
	    return pallindrome(str,start+1,end -1);
	}
	public static void main(String args[]){
	    String s ="madam";
	    
	    if(pallindrome(s,0, s.length()-1))
	    System.out.println("pallindrome");
	    else
	    System.out.println("Not a pallindrome");
	}
}