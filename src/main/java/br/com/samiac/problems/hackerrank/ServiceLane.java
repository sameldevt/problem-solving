package br.com.samiac.problems.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

	public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {

		List<Integer> list = new ArrayList<>();

		for (int index = 0; index < cases.size(); index++) {

			int start = cases.get(index).get(0);
			int finish = cases.get(index).get(1);

			int i = start;

			int min = Integer.MAX_VALUE;

			while (i <= finish) {

				if (width.get(i) < min) {
					min = width.get(i);
				}

				i++;
			}

			list.add(min);
		}

		return list;
	}

}
