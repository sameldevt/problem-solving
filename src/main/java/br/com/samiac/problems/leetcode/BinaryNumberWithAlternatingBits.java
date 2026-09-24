package br.com.samiac.problems.leetcode;

public class BinaryNumberWithAlternatingBits {

	//	public boolean hasAlternatingBits(int n) {
	//		String bN = Integer.toBinaryString(n);
	//
	//		char last = bN.charAt(0);
	//
	//		for (int i = 1; i < bN.length(); i++) {
	//			if(bN.charAt(i) == last){
	//				return false;
	//			}
	//
	//			last = bN.charAt(i);
	//		}
	//
	//		return true;
	//	}

	public boolean hasAlternatingBits(int n) {
		int prev = n & 1;
		n = n >> 1;

		while(n > 0){
			int last = n & 1;

			if(last == prev){
				return false;
			}

			n = n >> 1;
			prev = last;
		}

		return true;
	}
}
