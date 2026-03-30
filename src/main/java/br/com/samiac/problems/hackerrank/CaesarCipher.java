package br.com.samiac.problems.hackerrank;

public class CaesarCipher {

	public static String caesarCipher(String s, int k) {

		StringBuilder sb = new StringBuilder();

		for (int index = 0; index < s.length(); index++) {

			char c = s.charAt(index);

			int v = k % 26;

			if ((c >= 'A' && c <= 'Z')) {
				if (c + v > 'Z') {
					int x = 'Z' - c;
					v -= x;
					c = 'A' - 1;
				}

				c += v;

				sb.append(c);
			} else if (c >= 'a' && c <= 'z') {
				if (c + v > 'z') {
					int x = 'z' - c;
					v -= x;
					c = 'a' - 1;
				}

				c += v;

				sb.append(c);
			} else {
				sb.append(c);
			}

		}

		return sb.toString();
	}

}
