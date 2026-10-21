package br.com.samiac.problems.leetcode;

public class ShuffleTheArray {

	//	public int[] shuffle(int[] nums, int n) {
	//		int size = nums.length, index = 0, j = n, i = 0;
	//
	//		int[] newArr = new int[size];
	//
	//		while (index < size) {
	//			if (index % 2 == 0) {
	//				newArr[index] = nums[i];
	//				i++;
	//			} else {
	//				newArr[index] = nums[j];
	//				j++;
	//			}
	//
	//			index++;
	//		}
	//
	//		return newArr;
	//	}
	public int[] shuffle(int[] nums, int n) {
		int index = 0;

		int[] newArr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			newArr[i++] = nums[index];
			newArr[i] = nums[index + n];
			index++;
		}

		return newArr;
	}
}
