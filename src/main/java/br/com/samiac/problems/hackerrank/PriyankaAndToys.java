package br.com.samiac.problems.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PriyankaAndToys {

	public static int toys(List<Integer> w) {

		w.sort(Comparator.naturalOrder());

		List<List<Integer>> list = new ArrayList<>();

		list.add(new ArrayList<>());
		int container = 0;
		int min = w.get(0);

		for (int index = 1; index < w.size(); index++) {

			int value = w.get(index);

			if (Math.abs(value - min) <= 4) {
				list.get(container).add(value);
			} else {
				list.add(new ArrayList<>());
				container++;
				min = value;
			}
		}

		return list.size();
	}
}
