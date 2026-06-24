import java.util.*;
public class Main{
    public static void main(String args[]){
        Solution solver = new Solution();
        String[]ops={"5","2","C","D","+"};
        System.out.println(solver.calspoint(ops));
    }
}

class Solution
{
	public int calspoint(String[]Operations) {
		List<Integer> stack = new ArrayList<>();

		for(String op : Operations) {
			if(op.equals("+")) {
				int size = stack.size();
				stack.add(stack.get(size -1)+stack.get(size -2));
			} else if(op.equals("D")) {
				int size=stack.size();
				stack.add(stack.get(size-1)*2);
			} else if(op.equals("C")) {
				stack.remove(stack.size()-1);
			} else {
				stack.add(Integer.parseInt(op));
			}
		}
		int totalSum=0;
		for(int score : stack) {
			totalSum+=score;

		}
		return totalSum;
	}
}

