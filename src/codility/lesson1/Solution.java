package codility.lesson1;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(9));
	}

	public int solution(int N) {
		// write your code in Java SE 8
		if (N > 4 && N < 2147483647) {
			int max = 0, oneMetBack = 0, oneMetForw = 0, result = N, count = 0;

			while (result >= 1) {
				count++;
				if (result % 2 == 1) {
					if (oneMetBack > 0) {
						if (oneMetForw > 0) {
							oneMetBack = oneMetForw;
							oneMetForw = count;
						} else
							oneMetForw = count;
					} else {
						oneMetBack = count;
					}
					if (oneMetBack > 0 && oneMetForw > 0)
						max = Math.max(max, (oneMetForw - oneMetBack - 1));
				}

				result = result / 2;
			}
			return max;
		}
		return 0;
	}
}
