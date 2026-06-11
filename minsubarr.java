import java.util.*;
class Main
{
static int minSubArrayLen(int target,int[]nums){
    int left=0;
    int sum=0;
    
    int minLen = Integer.MAX_VALUE;
    
    for(int right=0;right<nums.length;right++){
        sum+=nums[right];
        
        while(sum>=target){
            minLen=Math.min(minLen,right - left +1);
                sum-=nums[left];
                left++;
        }}
        return minLen==Integer.MAX_VALUE ? 0:minLen;
    }
    public static void main(String [] args){
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("Test Case 1:");
        System.out.println("Input  : target = " + target1 + ", nums = " + Arrays.toString(nums1));
        System.out.println("Output : " + minSubArrayLen(target1, nums1));
        System.out.println("Expected: 2");
        System.out.println();

        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println("Test Case 2:");
        System.out.println("Input  : target = " + target2 + ", nums = " + Arrays.toString(nums2));
        System.out.println("Output : " + minSubArrayLen(target2, nums2));
        System.out.println("Expected: 1");
        System.out.println();

        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Test Case 3:");
        System.out.println("Input  : target = " + target3 + ", nums = " + Arrays.toString(nums3));
        System.out.println("Output : " + minSubArrayLen(target3, nums3));
        System.out.println("Expected: 0");
    }
}
