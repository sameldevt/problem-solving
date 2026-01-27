package br.com.samiac.problems.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequenceEquation {

	public static List<Integer> permutationEquation(List<Integer> p) {

		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < p.size(); index++) {
			map.put(p.get(index), index + 1);
		}

		for (int index = 1; index <= p.size(); index++) {

			int i = map.get(index);
			int j = map.get(i);

			list.add(j);
		}

		return list;
	}

}
