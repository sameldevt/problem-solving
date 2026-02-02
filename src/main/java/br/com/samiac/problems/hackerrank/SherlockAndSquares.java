package br.com.samiac.problems.hackerrank;

public class SherlockAndSquares {

	public static int squares(int a, int b) {

		int sqrs = 0, x = (int) Math.sqrt(a), sqr = x * x;

		while (sqr <= b) {

			if (sqr >= a) {
				sqrs++;
			}

			x += 1;
			sqr = x * x;
		}

		return sqrs;

	}

}
