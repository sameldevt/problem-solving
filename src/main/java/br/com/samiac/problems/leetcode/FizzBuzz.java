package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		List<String> ans = new ArrayList<>();

		for (int index = 1; index <= n; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				ans.add("FizzBuzz");
			} else if (index % 3 == 0) {
				ans.add("Fizz");
			} else if (index % 5 == 0) {
				ans.add("Buzz");
			} else {
				ans.add(Integer.toString(index));
			}
		}

		return ans;
	}
}
