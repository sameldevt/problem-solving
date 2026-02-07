package br.com.samiac.problems.hackerrank;

public class ChocolateFeast {

	public static int chocolateFeast(int n, int c, int m) {

		int chocolates = n / c;
		int wrappers = chocolates;

		while (wrappers > 0) {

			int newChocolates = wrappers / m;

			chocolates += newChocolates;

			wrappers = wrappers < m ? 0 : (wrappers % m) + newChocolates;
		}

		return chocolates;
	}
}
