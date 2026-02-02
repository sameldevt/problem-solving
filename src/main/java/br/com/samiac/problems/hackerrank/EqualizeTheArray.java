package br.com.samiac.problems.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

	public static int equalizeArray(List<Integer> arr) {

		Map<Integer, Integer> frequencies = new HashMap<>();

		int freq = 0;

		for (int index = 0; index < arr.size(); index++) {

			int key = arr.get(index);

			if (frequencies.get(key) == null) {
				frequencies.put(key, 1);
			} else {
				frequencies.put(key, frequencies.get(key) + 1);
			}

			if (frequencies.get(key) > freq) {
				freq = frequencies.get(key);
			}
		}

		return arr.size() - freq;
	}
}
