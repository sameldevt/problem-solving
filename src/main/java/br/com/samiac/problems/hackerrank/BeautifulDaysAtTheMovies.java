package br.com.samiac.problems.hackerrank;

public class BeautifulDaysAtTheMovies {

	/*
		10 - 01
	 */
	public static int beautifulDays(int i, int j, int k) {

		int totalDays = 0;

		int diff = Math.abs(i - j);

		for (int index = 0; index <= diff; index++) {

			int value = i + index;
			int reversed = reverseInteger(value);

			if (Math.abs(value - reversed) % k == 0) {
				totalDays++;
			}
		}

		return totalDays;
	}

	private static int reverseInteger(int i) {
		StringBuilder result = new StringBuilder();

		String value = String.valueOf(i);

		for (int index = value.length() - 1; index >= 0; index--) {

			char c = value.charAt(index);

			result.append(c);
		}

		return Integer.parseInt(result.toString());
	}

}
