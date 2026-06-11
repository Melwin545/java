import java.util.*;

public class Main {

	static int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		int[] result = new int[n - k + 1];
		Deque<Integer> dq = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {

			if (!dq.isEmpty() && dq.peek() < i - k + 1)
				dq.poll();

			while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
				dq.pollLast();

			dq.offer(i);

			if (i >= k - 1)
				result[i - k + 1] = nums[dq.peek()];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;

		System.out.println("Input  : " + Arrays.toString(nums));
		System.out.println("K      : " + k);
		System.out.println("Output : " + Arrays.toString(maxSlidingWindow(nums, k)));
	}
}