package br.com.samiac.problems.hackerrank;

public class LibraryFine {

	// time = o(1)
	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

		if (y1 > y2) {
			return 10000;
		}

		if (m1 > m2 && y2 == y1) {
			return 500 * (m1 - m2);
		}

		if (d1 > d2 && m2 == m1 && y2 == y1) {
			return 15 * (d1 - d2);
		}

		return 0;

	}
}
