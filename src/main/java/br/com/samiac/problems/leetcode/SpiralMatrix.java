package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();

		int r = 0;
		int c = 0;

		int d = 1;

		int count = 0;
		int size = matrix.length * matrix[0].length;

		while (count < size) {

			list.add(matrix[r][c]);
			matrix[r][c] = Integer.MAX_VALUE;

			switch (d) {
				case 1:
					if (c + 1 < matrix[0].length && matrix[r][c + 1] != Integer.MAX_VALUE) {
						c = c + 1;
					} else {
						d = 2;
						r++;
					}
					break;
				case 2:
					if (r + 1 < matrix.length && matrix[r + 1][c] != Integer.MAX_VALUE) {
						r = r + 1;
					} else {
						d = 3;
						c--;
					}
					break;
				case 3:
					if (c - 1 >= 0 && matrix[r][c - 1] != Integer.MAX_VALUE) {
						c = c - 1;
					} else {
						d = 4;
						r--;
					}
					break;
				case 4:
					if (r - 1 >= 0 && matrix[r - 1][c] != Integer.MAX_VALUE) {
						r = r - 1;
					} else {
						d = 1;
						c++;
					}
					break;
			}

			count++;
		}

		return list;
	}

}
