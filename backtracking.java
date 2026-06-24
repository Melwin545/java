import java.util.*;
public class Main
{
    static void subsets(int[] nums,int index, List<Integer>current) {
	    if(index==nums.length){
	        System.out.println(current);
	        return;
	    }
	    current.add(nums[index]);//choose the num find c start pos o (index 0)
	    subsets(nums,index +1,current); // explore that no from o gopt to a
	    current.remove(current.size()-1); //backtrack or undo if its not there 
	    subsets(nums,index+1,current); //try another choice choose b (index 0+1) (index 1+1)=c
    }
    public static void main(String[]args){
        int[]nums={1,2};
        subsets(nums,0,new ArrayList<>());
    }
}
