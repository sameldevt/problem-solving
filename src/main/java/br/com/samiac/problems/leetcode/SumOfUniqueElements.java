package br.com.samiac.problems.leetcode;

public class SumOfUniqueElements {

	//	public int sumOfUnique(int[] nums) {
	//		Map<Integer, Integer> map = new HashMap<>();
	//
	//		for (int n : nums) {
	//			if (map.containsKey(n)) {
	//				map.put(n, map.get(n) + 1);
	//			} else {
	//				map.put(n, 1);
	//			}
	//		}
	//
	//		int sum = 0;
	//
	//		for (int key : map.keySet()) {
	//			if (map.get(key) == 1) {
	//				sum += key;
	//			}
	//		}
	//
	//		return sum;
	//	}

	public int sumOfUnique(int[] nums) {
		int[] freq = new int[101];

		for (int n : nums) {
			freq[n]++;
		}

		int sum = 0;

		for (int n : nums) {
			if (freq[n] == 1) {
				sum += n;
			}
		}

		return sum;
	}
}
