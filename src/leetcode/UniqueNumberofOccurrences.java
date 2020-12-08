package leetcode;

import java.util.HashSet;
import java.util.Hashtable;

/*
 * leetcode 1207. Unique Number of Occurrences
 * https://leetcode.com/problems/unique-number-of-occurrences/
 * */

public class UniqueNumberofOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		Hashtable<Integer, Integer> ht = new Hashtable();
		HashSet hs = new HashSet();
		Integer freq = 0;
		if (arr.length < 1 || arr.length > 1000)
			return false;
		for (Integer elem : arr) {
			freq = ht.get(elem);
			if (freq != null) {
				ht.put(elem, freq + 1);
			} else
				ht.put(elem, 1);
		}
		for (Integer freqValue : ht.values()) {
			if (hs.contains(freqValue))
				return false;
			else
				hs.add(freqValue);
		}
		return true;
	}
}
