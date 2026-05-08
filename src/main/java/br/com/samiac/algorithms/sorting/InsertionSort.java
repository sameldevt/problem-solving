package br.com.samiac.algorithms.sorting;

public class InsertionSort {

	public static void sort(int[] keys) {

		for (int index = 1; index < keys.length; index++) {
			int key = keys[index];
			int j = index - 1;

			while (j > -1 && keys[j] > key) {
				keys[j + 1] = keys[j];
				j -= 1;
			}

			keys[j + 1] = key;
		}
	}
}
