package br.com.samiac.problems.leetcode;

public class NumberComplement {

	//	public int findComplement(int num) {
	//		StringBuilder sb = new StringBuilder();
	//
	//		while (num != 0) {
	//			int x = num & 1;
	//
	//			sb.insert(0, x == 0 ? '1' : '0');
	//
	//			num = num >> 1;
	//		}
	//
	//		return Integer.parseInt(sb.toString(), 2);
	//	}

	public int findComplement(int num) {
		int mask = 0;
		int temp = num;

		while (temp > 0) {
			mask = (mask << 1) | 1;
			temp >>= 1;
		}

		return num ^ mask;
	}
}
