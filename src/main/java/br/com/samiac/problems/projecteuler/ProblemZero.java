package br.com.samiac.problems.projecteuler;

public class ProblemZero {

	public long response() {
		long sum = 0;
		long num = 1;

		while (num <= 298000) {

			long v = num * num;

			if (v % 2 != 0) {
				sum += v;
			}

			num++;
		}

		return sum;
	}
}
