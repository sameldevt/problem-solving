package br.com.samiac.problems.hackerrank;

import java.util.Comparator;
import java.util.List;

public class MarcsCakewalk {

	public static long marcsCakewalk(List<Integer> calorie) {
		long sum = 0;

		calorie.sort(Comparator.reverseOrder());

		for (int index = 0; index < calorie.size(); index++) {
			sum += Math.pow(2, index) * calorie.get(index);
		}

		return sum;
	}
}
