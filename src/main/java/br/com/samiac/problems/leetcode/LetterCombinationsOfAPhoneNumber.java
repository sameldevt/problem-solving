package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

	Map<Character, String> map = Map.of( //
			'2', "abc", //
			'3', "def", //
			'4', "ghi", //
			'5', "jkl", //
			'6', "mno", //
			'7', "pqrs", //
			'8', "tuv", //
			'9', "wxyz");

	/*
		digits = "23"
		["ad","ae","af","bd","be","bf","cd","ce","cf"]
	 */
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();

		backtrack(new StringBuilder(), result, digits, 0);

		return result;
	}

	private void backtrack(StringBuilder r, List<String> result, String digits, int index) {

		if (r.length() == digits.length()) {
			result.add(r.toString());
			return;
		}

		for (char c : map.get(digits.charAt(index)).toCharArray()) {
			r.append(c);
			backtrack(r, result, digits, index + 1);
			r.deleteCharAt(r.length() - 1);
		}

	}
}
