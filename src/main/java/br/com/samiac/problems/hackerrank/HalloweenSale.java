package br.com.samiac.problems.hackerrank;

public class HalloweenSale {

	public static int howManyGames(int p, int d, int m, int s) {

		int total = 0;

		while (p > m) {

			if (p < s) {
				total++;
			}

			s -= p;
			p -= d;
		}

		int div = s / m;

		return div < 0 ? total : total + div;
	}
}
