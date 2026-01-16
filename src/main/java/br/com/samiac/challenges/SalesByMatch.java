package br.com.samiac.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

	public static int sockMerchant(int n, List<Integer> ar) {

		int pairs = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < n; index++) {

			int listIndex = ar.get(index);

			if (map.get(listIndex) != null) {

				int value = map.get(listIndex);

				map.put(listIndex, value + 1);

				continue;
			}

			map.put(listIndex, 1);
		}

		for (Integer key : map.keySet()) {

			int value = map.get(key);

			if (value % 2 != 0) {

				value -= 1;

				if (value > 0) {
					pairs += value / 2;
				}

				continue;
			}

			if (value > 1) {
				pairs += value / 2;
			}

		}

		return pairs;
	}
}
