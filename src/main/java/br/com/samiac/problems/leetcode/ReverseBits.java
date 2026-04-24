package br.com.samiac.problems.leetcode;

public class ReverseBits {

	public static int reverseBits(int n) {

		StringBuilder bits = new StringBuilder();

		long v = n;

		while (bits.length() != 32) {

			long rest = v % 2;
			long div = v / 2;

			bits.append(rest);

			v = div;
		}

		return (int) Long.parseLong(bits.toString(), 2);
	}
}
