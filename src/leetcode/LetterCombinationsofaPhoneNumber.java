package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * leetcode 17. Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/ 
 * */
public class LetterCombinationsofaPhoneNumber {
	public List<String> letterCombinations(String digits) {
		ArrayList<String> list = new ArrayList<>();
		if (digits.equals(""))
			return list;

		HashMap<Character, String> phone = new HashMap<>();
		phone.put('0', "0");
		phone.put('1', "1");
		phone.put('2', "abc");
		phone.put('3', "def");
		phone.put('4', "ghi");
		phone.put('5', "jkl");
		phone.put('6', "mno");
		phone.put('7', "pqrs");
		phone.put('8', "tuv");
		phone.put('9', "wxyz");

		char[] numbers = digits.toCharArray();

		list = letterCombinationsUtil(numbers, numbers.length, phone);

		return list;
	}

	public ArrayList<String> letterCombinationsUtil(char[] numbers, int n, HashMap<Character, String> phone) {
		ArrayList<String> list = new ArrayList<>();

		Queue<String> q = new LinkedList<>();
		q.add("");

		while (!q.isEmpty()) {
			String s = q.remove();

			if (s.length() == n)
				list.add(s);
			else {
				String val = phone.get(numbers[s.length()]);
				for (int i = 0; i < val.length(); i++) {
					q.add(s + val.charAt(i));
				}
			}
		}
		return list;
	}
}
