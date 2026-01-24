package br.com.samiac.problems.hackerrank;

public class FindDigits {

	public static int findDigits(int n) {

		int x = n;

		int count = 0;

		while (x != 0) {

			int v = x % 10;

			if (v != 0 && n % v == 0) {
				count++;
			}

			x /= 10;
		}

		return count;
	}
}
