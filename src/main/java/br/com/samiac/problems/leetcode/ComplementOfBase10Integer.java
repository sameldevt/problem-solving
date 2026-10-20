package br.com.samiac.problems.leetcode;

public class ComplementOfBase10Integer {

	//	public int bitwiseComplement(int n) {
	//
	//		if (n == 0) {
	//			return 1;
	//		}
	//
	//		StringBuilder sb = new StringBuilder();
	//
	//		while (n != 0) {
	//			int last = n & 1;
	//
	//			sb.insert(0, last ^ 1);
	//
	//			n = n >> 1;
	//		}
	//
	//		return Integer.parseInt(sb.toString(), 2);
	//	}

	public int bitwiseComplement(int n) {

		if (n == 0) {
			return 1;
		}

		int mask = 0;
		int temp = n;

		while (temp > 0) {
			mask = (mask << 1) | 1;
			temp >>= 1;
		}

		return n ^ mask;
	}
}
