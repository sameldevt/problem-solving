package br.com.samiac.problems.leetcode;

public class DuplicateZeros {

	public void duplicateZeros(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int v = arr[i];

			if (v == 0 && i + 1 < arr.length) {

				int t = arr[i + 1];
				arr[i + 1] = 0;

				int nI = i + 2;

				while (nI < arr.length) {
					int t2 = arr[nI];
					arr[nI] = t;
					t = t2;
					nI++;
				}

				i += 1;
			}
		}
	}
}
