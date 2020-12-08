package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * leetcode 1046. Last Stone Weight
 * https://leetcode.com/problems/last-stone-weight/
 * */
public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		if (stones == null)
			return 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < stones.length; i++) {
			pq.offer(stones[i]);
		}
		while (pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();
			if (first != second) {
				int rem = Math.abs(first - second);
				pq.offer(rem);
			}
		}
		return pq.size() == 1 ? pq.poll() : 0;
	}
}
