import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of activities");
		int n = sc.nextInt();

		int[] start = new int[n];
		int[] end = new int[n];

		for (int i = 0; i < n; i++) {
			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
		}

		int count = 1;
		int lastEnd = end[0];

		for (int i = 1; i < n; i++) {
			if (start[i] >= lastEnd) {
				count++;
				lastEnd = end[i];
			}
		}

		System.out.println("Max Activities = " + count);
	}
}