package br.com.samiac.problems.leetcode;

public class Base7 {

	public String convertToBase7(int num) {
		StringBuilder sb = new StringBuilder();

		int z = num;
		num = Math.abs(num);

		while (num >= 7) {
			int x = num / 7;
			int r = num % 7;

			sb.insert(0, r);

			num = x;
		}

		sb.insert(0, num);

		if (z < 0) {
			sb.insert(0, '-');
		}

		return sb.toString();
	}
}
