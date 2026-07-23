package br.com.samiac.problems.projecteuler;

public class MultiplesOf3Or5 {

	public long response() {
		long sum = 0;
		long num = 1;

		while (num < 1000) {

			if (num % 3 == 0 || num % 5 == 0) {
				sum += num;
			}

			num++;
		}

		return sum;
	}
}
