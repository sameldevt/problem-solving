package br.com.samiac.problems.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LuckBalance {

	public static int luckBalance(int k, List<List<Integer>> contests) {

		int totalLuck = 0;

		contests = sort(contests);

		int lose = 0;

		for (List<Integer> l : contests) {
			int luck = l.get(0);
			int importance = l.get(1);

			if (importance == 1 && lose == k) {
				totalLuck -= luck;
			}

			if (importance == 1 && lose < k) {
				lose++;
				totalLuck += luck;
			}

			if (importance == 0) {
				totalLuck += luck;
			}
		}

		return totalLuck;
	}

	private static List<List<Integer>> sort(List<List<Integer>> contests) {

		List<List<Integer>> list = new ArrayList<>(contests);

		for (int index = 1; index < contests.size(); index++) {
			int luck = contests.get(index).get(0);
			int previousIndex = index - 1;

			while (previousIndex >= 0 && list.get(previousIndex).get(0) < luck) {
				list.set(previousIndex + 1, list.get(previousIndex));
				previousIndex -= 1;
			}

			list.set(previousIndex + 1, contests.get(index));
		}

		return list;
	}

}
