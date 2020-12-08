package leetcode;

import java.util.Arrays;

/* 
 * leetcode 322. Coin Change
 * https://leetcode.com/problems/coin-change/ 
 * */
public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] solution = new int[amount + 1];
		Arrays.fill(solution, amount + 1);
		solution[0] = 0;

		for (int i = 0; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					solution[i] = Math.min(solution[i], 1 + solution[i - coins[j]]);
				} else {
					break;
				}
			}
		}
		return solution[amount] > amount ? -1 : solution[amount];
	}
}
