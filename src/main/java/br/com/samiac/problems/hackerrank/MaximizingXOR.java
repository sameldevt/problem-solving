package br.com.samiac.problems.hackerrank;

public class MaximizingXOR {

	/*

		10  -> 0000000000001010
	 	15  -> 0000000000001111

	 	xor -> 0000000000000101
	 */
	public static int maximizingXor(int l, int r) {

		int max = 0;

		for(int index = l; index <= r; index++){
			for(int index2 = index; index2 <= r; index2++){
				int x = index ^ index2;

				if(x > max){
					max = x;
				}
			}
		}

		return max;
	}

}
