package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

	public String[] uncommonFromSentences(String s1, String s2) {
		List<String> uncommon = new ArrayList<>();

		Map<String, Integer> map = new HashMap<>();

		String[] arrS1 = s1.split(" ");

		for (String s : arrS1) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}

		String[] arrS2 = s2.split(" ");

		for (String s : arrS2) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}

		for (String s : map.keySet()) {
			if (map.get(s) == 1) {
				uncommon.add(s);
			}
		}

		String[] uncommonArray = new String[uncommon.size()];

		for (int i = 0; i < uncommonArray.length; i++) {
			uncommonArray[i] = uncommon.get(i);
		}

		return uncommonArray;
	}
}
