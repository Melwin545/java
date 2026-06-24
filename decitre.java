public class Main
{
	static void subsets(int[] nums,int index,String current) {
		if(index==nums.length){
		    System.out.println(current);
		    return;
		}
		subsets(nums,index+1,current+nums[index] +"");
		subsets(nums,index+1,current);
	}
	public static void main(String[]args){
	    int[]nums={1,2,3,4};
	    subsets(nums,0,"");
	}
}