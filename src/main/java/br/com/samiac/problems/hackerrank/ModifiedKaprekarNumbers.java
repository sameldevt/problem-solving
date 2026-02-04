package br.com.samiac.problems.hackerrank;

public class ModifiedKaprekarNumbers {

	/*
		# optimized solution:

		public static void kaprekarNumbers(int p, int q) {
			boolean found = false;

			for (long n = p; n <= q; n++) {
				long sq = n * n;

				int digits = String.valueOf(sq).length();
				long div = (long) Math.pow(10, digits / 2);

				long left = sq / div;
				long right = sq % div;

				if (left + right == n) {
					System.out.print(n + " ");
					found = true;
				}
			}

			if (!found) {
				System.out.println("INVALID RANGE");
			}
		}
	 */
	public static void kaprekarNumbers(int p, int q) {

		boolean found = false;

		for (int index = p; index <= q; index++) {

			long pow = (long) index * index;
			String powStr = String.valueOf(pow);

			String left = powStr.substring(0, powStr.length() / 2);
			String right = powStr.substring(powStr.length() / 2);

			int sum;

			if (left.isEmpty()) {
				sum = Integer.parseInt(right);
			} else {
				sum = Integer.parseInt(left) + Integer.parseInt(right);
			}

			if (sum == index) {
				System.out.print(sum + " ");
				found = true;
			}
		}

		if (!found) {
			System.out.println("INVALID RANGE");
		}
	}
}
