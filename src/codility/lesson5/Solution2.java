package codility.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		int[] P = { 2, 5, 0 };
		int[] Q = { 4, 5, 6 };
		Solution2 sol = new Solution2();
		// ('CAGCCTA', [2, 5, 0], [4, 5, 6])
		// 'TC', [0, 0, 1], [0, 1, 1]
		for (Integer i : sol.solution("CAGCCTA", P, Q))
			System.out.print(i + " ");

	}

	public int[] solution(String S, int[] P, int[] Q) {
		// write your code in Java SE 8
		int[] result = new int[P.length];

		if (S != null) {
			if (!S.isEmpty()) {
				List<Integer> nucleotides = new ArrayList<>();
				for (Character c : S.toCharArray()) {
					switch (c) {
					case 'A':
						nucleotides.add(1);
						break;
					case 'C':
						nucleotides.add(2);
						break;
					case 'G':
						nucleotides.add(3);
						break;
					case 'T':
						nucleotides.add(4);
						break;
					default:
						System.err.println("Wrong input!!!");
					}
				}
				for (int i = 0; i < P.length; i++) {
					if (P[i] == Q[i])
						result[i] = nucleotides.get(P[i]);
					else
						result[i] = nucleotides.subList(P[i], Q[i] + 1).stream().min(Integer::compare).get();
				}

			}
		}

		return result;

	}

}
