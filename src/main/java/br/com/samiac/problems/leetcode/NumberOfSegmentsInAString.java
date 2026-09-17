package br.com.samiac.problems.leetcode;

public class NumberOfSegmentsInAString {

	public int countSegments(String s) {
		String[] split = s.split(" ");

		int count = split.length;

		for (String str : split) {
			if (str.isEmpty()) {
				count--;
			}
		}

		return count;
	}
}
