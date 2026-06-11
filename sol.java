import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();

        String s1 = "ab#c";
        String t1 = "ad#c";
        System.out.println("Test 1 Result: " + solver.backspaceCompare(s1, t1)); 

        String s2 = "a##c";
        String t2 = "#a#c";
        System.out.println("Test 2 Result: " + solver.backspaceCompare(s2, t2)); 

        String s3 = "a#c";
        String t3 = "b";
        System.out.println("Test 3 Result: " + solver.backspaceCompare(s3, t3)); 
    }
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }
    
    private String buildString(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();   
            }
        }
        
        return String.valueOf(stack);
    }
}