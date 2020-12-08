package leetcode;

/* 
 * leetcode 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/ 
 * */
public class MoveZeroes {
	// 1,0,0,3,12 1,0,3,12,0 1,3,12,0,0
	// O(N) O(N)
	public void moveZeroes(int[] nums) {
		int savePoint = nums.length, temp = 0;

		for (int i = 0; i < savePoint;) {// 1
			if (nums[i] == 0) {
				temp = i; // 0 1 2 3 4
				while (temp < savePoint - 1) {// 0<4
					nums[temp] = nums[temp + 1];// {1,0,3,12}
					temp++;
				}
				nums[temp] = 0;
				savePoint--;
			} else {
				i++;
			}
		}
	}
}
