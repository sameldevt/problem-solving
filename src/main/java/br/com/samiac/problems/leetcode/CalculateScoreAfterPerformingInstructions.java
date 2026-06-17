package br.com.samiac.problems.leetcode;

public class CalculateScoreAfterPerformingInstructions {

	public static long calculateScore(String[] instructions, int[] values) {
		long score = 0;

		boolean[] executed = new boolean[instructions.length];

		int index = 0;

		while (index < instructions.length && index >= 0 && !executed[index]) {
			executed[index] = true;

			if (instructions[index].charAt(0) == 'a') {
				score += values[index];
				index++;
			} else {
				index += values[index];
			}
		}

		return score;
	}
}
