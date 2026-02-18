package br.com.samiac.problems.hackerrank;

public class FlippingBits {

	public static long flippingBits(long n) {

		StringBuilder bits = new StringBuilder();

		while (bits.length() != 32) {

			long rest = n % 2;
			long div = n / 2;

			bits.insert(0, rest == 0 ? "1" : "0");

			n = div;
		}

		return Long.parseLong(bits.toString(), 2);
	}

}
