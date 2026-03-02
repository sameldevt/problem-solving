package br.com.samiac.problems.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

	public static int makingAnagrams(String s1, String s2) {
		int deletions = 0;

		Map<Character, Integer> mapS1 = new HashMap<>();
		Map<Character, Integer> mapS2 = new HashMap<>();

		for (char c : s1.toCharArray()) {
			if (!mapS1.containsKey(c)) {
				mapS1.put(c, 1);
			} else {
				mapS1.put(c, mapS1.get(c) + 1);
			}
		}

		for (char c : s2.toCharArray()) {
			if (!mapS2.containsKey(c)) {
				mapS2.put(c, 1);
			} else {
				mapS2.put(c, mapS2.get(c) + 1);
			}
		}

		for (char c : mapS1.keySet()) {
			if (mapS2.containsKey(c)) {
				deletions += Math.abs(mapS1.get(c) - mapS2.get(c));
			} else {
				deletions += mapS1.get(c);
			}
		}

		for (char c : mapS2.keySet()) {
			if (!mapS1.containsKey(c)) {
				deletions += mapS2.get(c);
			}
		}

		return deletions;
	}
}
