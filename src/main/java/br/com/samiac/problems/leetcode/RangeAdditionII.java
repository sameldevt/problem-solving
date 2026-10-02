package br.com.samiac.problems.leetcode;

public class RangeAdditionII {

	//	public int maxCount(int m, int n, int[][] ops) {
	//
	//		int[][] matrix = new int[m][n];
	//
	//		for (int[] op : ops) {
	//			int x = op[0];
	//			int y = op[1];
	//
	//			for (int i = 0; i < m; i++) {
	//				for (int j = 0; j < n; j++) {
	//					if (i < x && j < y) {
	//						matrix[i][j] = matrix[i][j] + 1;
	//					} else {
	//						break;
	//					}
	//				}
	//			}
	//		}
	//
	//		int count = 0;
	//
	//		for (int i = 0; i < m; i++) {
	//			for (int j = 0; j < n; j++) {
	//				if(matrix[i][j] == ops.length){
	//					count++;
	//				}
	//			}
	//		}
	//
	//		return count;
	//	}

	public int maxCount(int m, int n, int[][] ops) {

		int minX = m;
		int minY = n;

		for (int[] op : ops) {
			int x = op[0];
			int y = op[1];

			if (x < minX) {
				minX = x;
			}

			if (y < minY) {
				minY = y;
			}
		}

		return minX * minY;
	}
}
