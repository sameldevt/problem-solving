package br.com.samiac.problems.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0;

		int[] n = new int[nums1.length + nums2.length];
		int i = 0;

		while (i < nums1.length) {
			n[i] = nums1[i];
			i++;
		}

		int j = 0;

		while (j < nums2.length) {
			n[i] = nums2[j];
			j++;
			i++;
		}

		n = Arrays.stream(n).sorted().toArray();

		if (n.length % 2 == 0) {
			median = (n[n.length / 2 - 1] + n[n.length / 2]) / 2.0;
		} else {
			median = n[n.length / 2];
		}

		return median;
	}

}
