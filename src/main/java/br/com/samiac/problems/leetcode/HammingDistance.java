package br.com.samiac.problems.leetcode;

public class HammingDistance {

	//	public int hammingDistance(int x, int y) {
	//		String xB = Integer.toBinaryString(x);
	//		String yB = Integer.toBinaryString(y);
	//
	//		if (xB.length() < yB.length()) {
	//			StringBuilder sb = new StringBuilder(xB);
	//
	//			while (sb.length() != yB.length()) {
	//				sb.insert(0, '0');
	//			}
	//
	//			xB = sb.toString();
	//		}
	//
	//
	//		if (yB.length() < xB.length()) {
	//			StringBuilder sb = new StringBuilder(yB);
	//
	//			while (sb.length() != xB.length()) {
	//				sb.insert(0, '0');
	//			}
	//
	//			yB = sb.toString();
	//		}
	//
	//		int count = 0;
	//
	//		for (int i = 0; i < xB.length(); i++) {
	//			if (xB.charAt(i) != yB.charAt(i)) {
	//				count++;
	//			}
	//		}
	//
	//		return count;
	//	}

	public int hammingDistance(int x, int y) {
		int count = 0;

		while (x > 0 || y > 0) {
			count += (x & 1) ^ (y & 1);
			x >>= 1;
			y >>= 1;
		}

		return count;
	}
}
