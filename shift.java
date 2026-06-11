public class ShiftExample {
    public static void main(String[] args) {
        int num = 8; 

        
        int leftShift = num << 2;
        System.out.println(num + " << 2 = " + leftShift); 


        int rightShift = num >> 2; 
        System.out.println(num + " >> 2 = " + rightShift); 

        
        int negNum = -8; 
        int unsignedRightShift = negNum >>> 2;
        System.out.println(negNum + " >>> 2 = " + unsignedRightShift);
    }
}
