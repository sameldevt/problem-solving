package br.com.samiac.problems.hackerrank;

public class ViralAdvertising {

	public static int viralAdvertising(int n) {

		int v = 5;
		int r = 0;

		for (int index = 0; index < n; index++) {
			int x = v / 2;
			r += x;
			v = x * 3;
		}

		return r;
	}
}
