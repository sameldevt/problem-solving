package br.com.samiac.problems.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

	public static String pangrams(String s) {

		Set<Character> characterSet = new HashSet<>();

		s = s.replaceAll(" ", "").toLowerCase();

		for (int index = 0; index < s.length(); index++) {

			char c = s.charAt(index);

			if (c >= 'a' && c <= 'z') {
				characterSet.add(c);
			}
		}

		return characterSet.size() == 26 ? "pangram" : "not pangram";
	}
}
