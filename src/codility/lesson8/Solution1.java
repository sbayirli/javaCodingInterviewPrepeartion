package codility.lesson8;

import java.util.Hashtable;

public class Solution1 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[] arr = { 7 };
		System.out.println(sol.solution(arr));
	}

	public int solution(int[] A) {
		Hashtable<Integer, Integer> occuranceTable = new Hashtable<Integer, Integer>();

		if (A != null) {
			int dominLimit = A.length / 2;
			if (A.length == 1)
				return 0;
			else if (A.length > 1) {
				for (int i = 0; i < A.length; i++) {
					if (occuranceTable.get(A[i]) == null) {
						occuranceTable.put(A[i], 1);
					} else {
						int count = occuranceTable.get(A[i]);
						count++;
						if (count > dominLimit)
							return i;
						else
							occuranceTable.replace(A[i], (count - 1), count);
					}
				}

			}
		}
		return -1;

	}

}
