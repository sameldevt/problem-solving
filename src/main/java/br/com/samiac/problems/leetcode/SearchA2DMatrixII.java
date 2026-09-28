package br.com.samiac.problems.leetcode;

public class SearchA2DMatrixII {

	//	public boolean searchMatrix(int[][] matrix, int target) {
	//
	//		int i = 0;
	//		int j = 0;
	//
	//		while (i < matrix.length && j < matrix[0].length) {
	//			if (target >= matrix[i][0] && target >= matrix[0][j]) {
	//				int y = 0;
	//
	//				while (y < matrix[0].length) {
	//
	//					if (matrix[i][y] == target) {
	//						return true;
	//					}
	//
	//					y++;
	//				}
	//
	//				int x = 0;
	//
	//				while (x < matrix.length) {
	//
	//					if (matrix[x][j] == target) {
	//						return true;
	//					}
	//
	//					x++;
	//				}
	//			}
	//
	//			i++;
	//			j++;
	//		}
	//
	//		return false;
	//	}

	public boolean searchMatrix(int[][] matrix, int target) {
		for (int[] arr : matrix) {
			if (arr[0] <= target && arr[arr.length - 1] >= target) {
				if (binarySearch(arr, target)) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int value = arr[mid];

			if (value == target) {
				return true;
			} else if (value > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return false;
	}
}
