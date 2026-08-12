package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> mapS = new HashMap<>();
		Map<Character, Integer> mapT = new HashMap<>();

		for (char c : s.toCharArray()) {
			if (mapS.containsKey(c)) {
				mapS.put(c, mapS.get(c) + 1);
			} else {
				mapS.put(c, 1);
			}
		}

		for (char c : t.toCharArray()) {
			if (mapT.containsKey(c)) {
				mapT.put(c, mapT.get(c) + 1);
			} else {
				mapT.put(c, 1);
			}
		}

		for (char c : mapS.keySet()) {
			Integer cS = mapS.get(c);
			Integer cT = mapT.get(c);

			if (cS == null || cT == null) {
				return false;
			}

			if (!cS.equals(cT)) {
				return false;
			}
		}

		return true;
	}
}
