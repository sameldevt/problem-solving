package br.com.samiac.problems.hackerrank;

import java.util.List;

public class TheHurdleRace {

	public static int hurdleRace(int k, List<Integer> height) {

		int highest = 0;

		for (int h : height) {
			if (h > highest) {
				highest = h;
			}
		}

		return k > highest ? 0 : Math.abs(k - highest);
	}
}
