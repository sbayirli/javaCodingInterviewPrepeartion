package leetcode;

/* 
 * leetcode 200. Number of Islands
 * https://leetcode.com/problems/number-of-islands/ 
 * */

public class NumberofIslands {
	public int numIslands(char[][] grid) {
		int numberOfIslands = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1')
					numberOfIslands += findIsland(grid, i, j);
			}
		}
		return numberOfIslands;
	}

	public int findIsland(char[][] grid, int row, int column) {
		if (row < 0 || column < 0 || row >= grid.length || column >= grid[row].length || grid[row][column] == '0')
			return 0;

		grid[row][column] = '0';
		findIsland(grid, row + 1, column);
		findIsland(grid, row - 1, column);
		findIsland(grid, row, column + 1);
		findIsland(grid, row, column - 1);

		return 1;
	}
}
