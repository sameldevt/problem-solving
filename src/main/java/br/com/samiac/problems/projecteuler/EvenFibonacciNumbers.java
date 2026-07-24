package br.com.samiac.problems.projecteuler;

public class EvenFibonacciNumbers {

	public long evenFibonacciNumbers() {
		long sum = 0, v1 = 1, v2 = 1, t = 0;

		while (t < 4000000) {

			t = v1 + v2;

			if (t % 2 == 0) {
				sum += t;
			}

			v1 = v2;
			v2 = t;
		}

		return sum;
	}

}


