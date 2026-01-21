package br.com.samiac.problems.leetcode;

import java.util.Map;

public class RomanToInteger {

	/*
		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000
	 */
	private static final Map<Character, Integer> conversions = Map.of(
			'I', 1,
			'V', 5,
			'X', 10,
			'L', 50,
			'C', 100,
			'D', 500,
			'M', 1000
	);

	public static int romanToInt(String s) {

		int result = 0;

		int lastLetterValue = 0;

		for (int index = 0; index < s.length(); index++) {

			int letterValue = conversions.get(s.charAt(index));

			if (lastLetterValue == 0) {
				lastLetterValue = letterValue;
				result += lastLetterValue;
				continue;
			}

			if (lastLetterValue < letterValue) {
				result -= lastLetterValue;
				result += letterValue - lastLetterValue;
			} else {
				result += letterValue;
			}

			lastLetterValue = letterValue;
		}

		return result;
	}
}
