package br.com.samiac.challenges;

public class Staircase {

	public static void staircase(int n) {

		char[][] c = new char[n][n];

		for (int row = n - 1; row >= 0; row--) {
			for (int col = n - 1; col >= 0; col--) {

				if (col >= row) {
					c[row][col] = '#';
				} else {
					c[row][col] = ' ';
				}
			}

			System.out.println(c[row]);
		}

	}

}
