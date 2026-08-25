package br.com.samiac.problems.leetcode;

public class ScoreOfAString {

	public int scoreOfString(String s) {
		int score = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			int scoreI = s.charAt(i);
			int scoreJ = s.charAt(i + 1);

			score += Math.abs(scoreI - scoreJ);
		}

		return score;
	}
}
