package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

	public int calPoints(String[] operations) {
		List<Integer> hist = new ArrayList<>();

		int score = 0;

		for (String op : operations) {

			switch (op) {
				case "+" -> {
					int last = hist.size() - 1;
					int sum = hist.get(last) + hist.get(last - 1);
					score += sum;
					hist.add(sum);
				}
				case "D" -> {
					int t = hist.getLast() * 2;
					score += t;
					hist.add(t);
				}
				case "C" -> {
					score -= hist.getLast();
					hist.removeLast();
				}
				default -> {
					int num = Integer.parseInt(op);
					score += num;
					hist.add(num);
				}
			}

		}

		return score;
	}
}
