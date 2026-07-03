package br.com.samiac.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int index = 0; index < nums1.length; index++) {
			set1.add(nums1[index]);
		}

		for (int index = 0; index < nums2.length; index++) {
			if (set1.contains(nums2[index])) {
				set2.add(nums2[index]);
			}
		}

		int[] intersection = new int[set2.size()];

		int j = 0;
		for (Integer i : set2) {
			intersection[j++] = i;
		}

		return intersection;
	}
}
