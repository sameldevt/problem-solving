package br.com.samiac.problems.leetcode;

public class DecodeXORedArray {

	public static int[] decode(int[] encoded, int first) {
		int[] decoded = new int[encoded.length + 1];

		decoded[0] = first;

		for (int index = 0; index < encoded.length; index++) {
			decoded[index + 1] = decoded[index] ^ encoded[index];
		}

		return decoded;
	}
}
