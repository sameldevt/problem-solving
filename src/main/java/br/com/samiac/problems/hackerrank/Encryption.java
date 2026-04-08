package br.com.samiac.problems.hackerrank;

public class Encryption {

	public static String encryption(String s) {

		StringBuilder r = new StringBuilder();

		s = s.replace(" ", "");

		int rows = (int) Math.floor(Math.sqrt(s.length()));
		int columns = (int) Math.ceil(Math.sqrt(s.length()));

		if (rows * columns < s.length()) {
			rows++;
		}

		char[][] grid = new char[rows][columns];

		int column = 0;
		int row = 0;

		for (int index = 0; index < s.length(); index++) {
			char c = s.charAt(index);

			grid[row][column] = c;

			column++;

			if (column % columns == 0) {
				row++;
				column = 0;
			}
		}

		for (int indexCol = 0; indexCol < columns; indexCol++) {
			for (int indexRow = 0; indexRow < rows; indexRow++) {
				char c = grid[indexRow][indexCol];
				if (c != '\0') {
					r.append(c);
				}
			}

			if (indexCol != columns - 1) {
				r.append(" ");
			}
		}

		return r.toString();
	}

}
