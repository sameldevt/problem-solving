package br.com.samiac.problems.hackerrank;

public class ElectronicsShop {

	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int totalSpent = 0;

		for (int keyboardIndex = 0; keyboardIndex < keyboards.length; keyboardIndex++) {

			for (int driveIndex = 0; driveIndex < drives.length; driveIndex++) {

				int sum = keyboards[keyboardIndex] + drives[driveIndex];

				if (sum > totalSpent && sum <= b) {
					totalSpent = sum;
				}

			}

		}

		return totalSpent > 0 ? totalSpent : -1;
	}
}
