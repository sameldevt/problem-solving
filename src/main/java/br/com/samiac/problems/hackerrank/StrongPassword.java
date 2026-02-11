package br.com.samiac.problems.hackerrank;

public class StrongPassword {

	public static int minimumNumber(int n, String password) {
		int changes = 0;

		boolean hasNumbers = password.matches(".*[0-9].*");
		boolean hasLowerCase = password.matches(".*[a-z].*");
		boolean hasUpperCase = password.matches(".*[A-Z].*");
		boolean hasSpecialCharacter = password.matches(".*[!@#$%^&*()\\-+].*");

		if (!hasNumbers) {
			changes++;
		}

		if (!hasLowerCase) {
			changes++;
		}

		if (!hasUpperCase) {
			changes++;
		}

		if (!hasSpecialCharacter) {
			changes++;
		}

		if (n < 6) {
			changes = Math.max(Math.abs(n - 6), changes);
		}

		return changes;
	}
}
