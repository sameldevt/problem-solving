package br.com.samiac.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	public static int migratoryBirds(List<Integer> arr) {

		int result = 0;
		int resultIndex = 0;

		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		map.put(5, 0);

		for (int index = 0; index < arr.size(); index++) {

			int indexValue = arr.get(index);

			map.put(indexValue, map.get(indexValue) + 1);

			int v = map.get(indexValue);

			if (v > result) {
				result = v;
				resultIndex = indexValue;
			} else if (v == result) {
				if (resultIndex > indexValue) {
					resultIndex = indexValue;
				}
			}

		}

		return resultIndex;

	}
}
