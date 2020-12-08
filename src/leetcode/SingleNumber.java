package leetcode;

import java.util.Arrays;

/* 
 * leetcode 136. Single Number
 * https://leetcode.com/problems/single-number/ 
 * */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length) {
			if (i == nums.length - 1)
				return (nums[i]);
			if (nums[i] != nums[i + 1]) {
				return (nums[i]);
			}
			i += 2;
		}
		return 0;
	}
}
