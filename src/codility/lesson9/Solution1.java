package codility.lesson9;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[] arr = { 3, 2, 6, -1, 4, 5, -1, 2 };
		int min = Arrays.stream(arr).reduce(Integer::min).getAsInt();
		System.out.println(sol.solution(arr));
	}

	public int solution(int[] A) {
		// write your code in Java SE 8
		int[] maxStart = new int[A.length];
		int[] maxEnd = new int[A.length];
		int maxSum = 0, len = A.length;

		for (int i = len - 2; i > 0; --i) {
			maxSum = Math.max(0, A[i] + maxSum);
			maxStart[i] = maxSum;
		}
		maxSum = 0;
		for (int i = 1; i < len - 1; ++i) {
			maxSum = Math.max(0, A[i] + maxSum);
			maxEnd[i] = maxSum;
		}
		int maxDoubleSlice = 0;

		for (int i = 0; i < len - 2; ++i) {
			maxDoubleSlice = Math.max(maxDoubleSlice, maxEnd[i] + maxStart[i + 2]);
		}

		return maxDoubleSlice;
	}

}
