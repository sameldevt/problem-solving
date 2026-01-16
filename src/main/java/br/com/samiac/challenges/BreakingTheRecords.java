package br.com.samiac.challenges;

import java.util.List;

public class BreakingTheRecords {

	public static List<Integer> breakingRecords(List<Integer> scores) {

		int highest = scores.get(0);
		int lowest = scores.get(0);

		int highestCount = 0;
		int lowestCount = 0;

		for (int score : scores) {

			if (score > highest) {
				highest = score;
				highestCount++;
			} else if (score < lowest) {
				lowest = score;
				lowestCount++;
			}
		}

		return List.of(highestCount, lowestCount);
	}
}
