package br.com.samiac.problems.hackerrank;

public class TheLoveLetterMystery {

	/*
		lmnop
		adslkfjas
		bafhaef
		ofrhase
	 */
	public static int theLoveLetterMystery(String s) {

		int count = 0;

		for (int index = 0; index < s.length() / 2; index++) {

			char left = s.charAt(index);
			char right = s.charAt(s.length() - 1 - index);

			count += Math.abs(left - right);
		}

		return count;
	}
}
