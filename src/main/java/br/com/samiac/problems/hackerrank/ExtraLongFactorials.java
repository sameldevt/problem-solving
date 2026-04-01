package br.com.samiac.problems.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {

	public static void extraLongFactorials(int n) {
		BigInteger bigInteger = BigInteger.valueOf(n);

		for (int index = n - 1; index > 0; index--) {
			bigInteger = bigInteger.multiply(BigInteger.valueOf(index));
		}

		System.out.println(bigInteger);
	}
}
