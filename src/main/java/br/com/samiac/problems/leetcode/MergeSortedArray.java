package br.com.samiac.problems.leetcode;

import br.com.samiac.algorithms.sorting.InsertionSort;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int j = 0;
		for (int index = m; index < nums1.length; index++) {
			nums1[index] = nums2[j];
			j++;
		}

		InsertionSort.sort(nums1);
	}

}
