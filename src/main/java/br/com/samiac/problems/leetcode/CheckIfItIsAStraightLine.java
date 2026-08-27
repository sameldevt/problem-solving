package br.com.samiac.problems.leetcode;

public class CheckIfItIsAStraightLine {

	public boolean checkStraightLine(int[][] coordinates) {
		int diff1 = Integer.MAX_VALUE;
		int diff2 = Integer.MAX_VALUE;

		int[] prev = coordinates[0];

		for (int i = 1; i < coordinates.length; i++) {
			int diffX = prev[0] - coordinates[i][0];
			int diffY = prev[1] - coordinates[i][1];

			if (diff1 == Integer.MAX_VALUE) {
				diff1 = diffX;
				diff2 = diffY;
			}

			if (diffY * diff1 != diffX * diff2) {
				return false;
			}
		}

		return true;
	}
}
