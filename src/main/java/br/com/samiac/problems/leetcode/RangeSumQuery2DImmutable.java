package br.com.samiac.problems.leetcode;

public class RangeSumQuery2DImmutable {

	private final int[][] matrix;

	public RangeSumQuery2DImmutable(int[][] matrix) {
		this.matrix = matrix;
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;

		for (int r = row1; r <= row2; r++) {
			for (int c = col1; c <= col2; c++) {
				sum += matrix[r][c];
			}
		}

		return sum;
	}
}
