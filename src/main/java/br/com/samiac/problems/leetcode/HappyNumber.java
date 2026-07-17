package br.com.samiac.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public boolean isHappy(int n) {

		Set<Integer> set = new HashSet<>();

		while (n != 1 && !set.contains(n)) {
			set.add(n);

			int sum = 0;

			while (n > 0) {
				int x = n % 10;
				sum += (x * x);
				n = n / 10;
			}

			n = sum;
		}

		return n == 1;
	}

}
