package br.com.samiac.problems.leetcode;

public class ImageSmoother {

	//	public int[][] imageSmoother(int[][] img) {
	//
	//		int[][] newImg = new int[img.length][img[0].length];
	//
	//		for (int i = 0; i < img.length; i++) {
	//			for (int j = 0; j < img[0].length; j++) {
	//
	//				int cells = 0;
	//				int sum = 0;
	//
	//				cells++;
	//				sum += img[i][j];
	//
	//				if (i - 1 >= 0) {
	//					cells++;
	//					sum += img[i - 1][j];
	//				}
	//
	//				if (i + 1 < img.length) {
	//					cells++;
	//					sum += img[i + 1][j];
	//				}
	//
	//				if (j - 1 >= 0) {
	//					cells++;
	//					sum += img[i][j - 1];
	//				}
	//
	//				if (j + 1 < img[0].length) {
	//					cells++;
	//					sum += img[i][j + 1];
	//				}
	//
	//				if (i - 1 >= 0 && j - 1 >= 0) {
	//					cells++;
	//					sum += img[i - 1][j - 1];
	//				}
	//
	//				if (i - 1 >= 0 && j + 1 < img[0].length) {
	//					cells++;
	//					sum += img[i - 1][j + 1];
	//				}
	//
	//				if (i + 1 < img.length && j - 1 >= 0) {
	//					cells++;
	//					sum += img[i + 1][j - 1];
	//				}
	//
	//				if (i + 1 < img.length && j + 1 < img[0].length) {
	//					cells++;
	//					sum += img[i + 1][j + 1];
	//				}
	//
	//				newImg[i][j] = Math.floorDiv(sum, cells);
	//			}
	//		}
	//
	//		return newImg;
	//	}

	public int[][] imageSmoother(int[][] img) {

		int rows = img.length;
		int columns = img[0].length;

		int[][] newImg = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				int cells = 0;
				int sum = 0;

				for (int k = i - 1; k <= i + 1; k++) {
					for (int l = j - 1; l <= j + 1; l++) {
						if (k >= 0 && k < rows && l >= 0 && l < columns) {
							cells++;
							sum += img[k][l];
						}
					}
				}

				newImg[i][j] = sum / cells;
			}
		}

		return newImg;
	}
}
