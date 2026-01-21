package br.com.samiac.problems.hackerrank;

public class UtopianTree {

	public static int utopianTree(int n) {
		int finalHeight = 1;

		for (int index = 0; index < n; index++) {
			finalHeight = index % 2 == 0 ? finalHeight * 2 : finalHeight + 1;
		}

		return finalHeight;
	}
}
