package br.com.samiac.problems.leetcode;

public class SearchA2DMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		for (int row = 0; row < matrix.length; row++) {
			if (target <= matrix[row][matrix[0].length - 1]) {

				if (matrix[row][matrix[0].length - 1] == target) {
					return true;
				}

				int col = 0;

				while (col < matrix[0].length) {
					if (matrix[row][col] == target) {
						return true;
					}
					col++;
				}
			}
		}

		return false;
	}
}
