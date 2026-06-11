public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarray(arr, k));
    }

    public static int longestSubarray(int[] arr, int k) {
        int start = 0, sum = 0, maxLen = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];


            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }

        return maxLen;
    }
}
	