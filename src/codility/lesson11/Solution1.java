package codility.lesson11;

import java.util.HashMap;

public class Solution1 {
	public int[] solution(int[] A) {// %55 with performance problems
		// write your code in Java SE 8
		int[] result = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int k = 0; k < A.length; k++) {
				if (i != k) {
					if (A[i] % A[k] != 0)
						count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

	public int[] solution2(int[] A) {// %100

		int N = A.length;
		HashMap<Integer, Integer> count = new HashMap<>();

		for (int i : A) {
			Integer key = count.get(i);
			if (key != null) {
				count.put(i, key + 1);
			} else {
				count.put(i, 1);
			}
		}

		HashMap<Integer, Integer> divs = new HashMap<>();
		for (Integer n : count.keySet()) {
			int sum = 0;
			int j = 1;
			while (j * j <= n) {
				if (n % j == 0) {
					if (count.containsKey(j)) {
						sum += count.get(j);
					}
					// find n = j*k cases to add both to the dividors
					int k = n / j;
					if (k != j) {
						if (count.containsKey(k)) {
							sum += count.get(k);
						}
					}
				}
				j++;
			}

			divs.put(n, N - sum);
		}

		for (int i = 0; i < A.length; i++) {
			A[i] = divs.get(A[i]);
		}

		return A;
	}

}
