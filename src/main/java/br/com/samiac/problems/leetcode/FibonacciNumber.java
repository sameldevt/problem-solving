package br.com.samiac.problems.leetcode;

public class FibonacciNumber {

	//	public int fib(int n) {
	//		if (n == 0) {
	//			return 0;
	//		}
	//
	//		if (n == 1) {
	//			return 1;
	//		}
	//
	//		return fib(n - 1) + fib(n - 2);
	//	}

	public int fib(int n) {
		if (n == 0) {
			return 0;
		}

		int x = 0;
		int y = 1;

		for (int i = 2; i <= n; i++) {
			int z = x + y;

			x = y;
			y = z;
		}

		return y;
	}
}
