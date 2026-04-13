package br.com.samiac.problems.leetcode;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		boolean search = true;
		int searchIndex = digits.length - 1;

		while (search) {
			int v = digits[searchIndex];

			int t = v + 1;

			if (t > 9) {
				digits[searchIndex] = 0;
			} else {
				digits[searchIndex] = t;
				search = false;
			}

			if (searchIndex == 0 && v == 9) {
				int[] newArr = new int[digits.length + 1];

				newArr[0] = 1;

				int index = 0;

				while (index < digits.length) {
					newArr[index + 1] = digits[index];
					index++;
				}

				return newArr;
			}

			searchIndex -= 1;
		}

		return digits;
	}
}
