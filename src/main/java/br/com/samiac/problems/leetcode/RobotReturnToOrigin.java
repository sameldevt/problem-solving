package br.com.samiac.problems.leetcode;

public class RobotReturnToOrigin {

	public boolean judgeCircle(String moves) {
		int row = 0;
		int col = 0;

		for (char c : moves.toCharArray()) {

			switch (c) {
				case 'U':
					row--;
					break;
				case 'D':
					row++;
					break;
				case 'R':
					col++;
					break;
				case 'L':
					col--;
					break;
			}
		}

		return row == 0 && col == 0;
	}
}
