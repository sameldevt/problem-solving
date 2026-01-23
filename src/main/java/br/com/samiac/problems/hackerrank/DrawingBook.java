package br.com.samiac.problems.hackerrank;

public class DrawingBook {

	/*
		n = 6
		p = 2

		X 1 -> 2 3 -> 4 5 -> 6 X

		#
		n = 6;
		p = 5;

		1  2 3  4 5  6
		#

		#
		n = 6 - 2 = 4;
		p = 2

		2 3 -> 4 5
		#

		n = 5
		p = 3

		X 1 -> 2 3 -> 4 5

		#
		n = 5
		p = 3

		1  2 3  4 5


		#
	 */
	public static int pageCount(int n, int p) {
		if (p == n) {
			return 0;
		}

		int fromStart = p / 2;
		int fromEnd = (n - p) / 2;

		if (n % 2 == 0 && fromEnd < 1) {
			fromEnd = 1;
		}

		return Math.min(fromStart, fromEnd);
	}
}
