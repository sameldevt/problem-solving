package br.com.samiac.problems.hackerrank;

public class SuperReducedString {

	public static String superReducedString(String s) {

		boolean canContinue = true;

		while (canContinue) {

			char[] chars = s.toCharArray();

			for (int index = 0; index < chars.length - 1; index++) {

				char c1 = chars[index];
				char c2 = chars[index + 1];

				if (c1 == c2) {
					chars[index] = ' ';
					chars[index + 1] = ' ';

					StringBuilder temp = new StringBuilder();

					for (int i = 0; i < chars.length; i++) {
						if (chars[i] != ' ') {
							temp.append(chars[i]);
						}
					}

					s = temp.toString();
					break;
				}

				if (index + 1 == s.length() - 1) {
					canContinue = false;
				}

			}

			if (s.isEmpty()) {
				canContinue = false;
			}

		}

		return s.isEmpty() ? "Empty String" : s;

	}

}
