package br.com.samiac.problems.leetcode;

public class AddBinary {

	/*
		 1010
	 	 1011
		10101

		   11
		    1
		  100
	 */
	public String addBinary(String a, String b) {
		a = padLeft(a, b.length());
		b = padLeft(b, a.length());

		StringBuilder sb = new StringBuilder();

		int rest = 0;

		for (int i = a.length() - 1; i >= 0; i--) {
			int cA = a.charAt(i) == '1' ? 1 : 0;
			int cB = b.charAt(i) == '1' ? 1 : 0;

			int s = cA + cB + rest;

			if (s == 1) {
				sb.insert(0, '1');
			} else if (s == 0) {
				sb.insert(0, '0');
			} else {
				sb.insert(0, s > 2 ? '1' : '0');
				rest = 1;
				continue;
			}

			if (rest > 0) {
				rest = 0;
			}

		}

		if (rest > 0) {
			sb.insert(0, '1');
		}

		return sb.toString();
	}

	private String padLeft(String s, int size) {
		StringBuilder sb = new StringBuilder(s);

		while (sb.length() < size) {
			sb.insert(0, '0');
		}

		return sb.toString();
	}
}
