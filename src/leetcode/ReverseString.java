package leetcode;

/* 
 * leetcode 344. Reverse String
 * https://leetcode.com/problems/reverse-string/ 
 * */
public class ReverseString {
	public void reverseString(char[] s) {
		int i = 0, j = s.length - 1;
		char temp;
		while (i < j) {
			if (s[i] != s[j]) {
				temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
			i++;
			j--;
		}
	}
}
