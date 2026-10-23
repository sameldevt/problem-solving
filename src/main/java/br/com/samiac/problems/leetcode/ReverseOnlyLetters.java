package br.com.samiac.problems.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class ReverseOnlyLetters {

	public String reverseOnlyLetters(String s) {
		StringBuilder sb = new StringBuilder(s.length());

		Map<Integer, Character> map = new TreeMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				sb.insert(0, c);
			} else {
				map.put(i, c);
			}
		}

		for (int k : map.keySet()) {
			sb.insert(k, map.get(k));
		}

		return sb.toString();
	}
}
