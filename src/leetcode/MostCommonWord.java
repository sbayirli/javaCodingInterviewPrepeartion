package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * leetcode 819. Most Common Word
 * https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		HashSet<String> bannedWords = new HashSet<>();
		for (String word : banned) {
			bannedWords.add(word);
		}

		HashMap<String, Integer> counts = new HashMap<>();
		paragraph = paragraph.replaceAll("[^a-zA-Z]", " ");
		String[] splitted = paragraph.toLowerCase().split(" ");
		for (String word : splitted) {
			if (!bannedWords.contains(word)) {
				counts.put(word, counts.getOrDefault(word, 0) + 1);
			}
		}

		String result = "";
		for (String key : counts.keySet()) {
			if (result.equals("") || counts.get(key) > counts.get(result)) {
				result = key;
			}
		}
		return result;
	}
}
