package br.com.samiac.problems.hackerrank;

public class RepeatedString {

	/*
		aba aba aba a
	 */
	public static long repeatedString(String s, long n) {

		long z = n % s.length() == 0 ? 0 : n % s.length();

		long x = n / s.length();

		long aCount = 0;
		long aCountZ = 0;

		for (int index = 0; index < s.length(); index++) {

			char c = s.charAt(index);

			if (c == 'a') {
				aCount++;
			}

			if(index < z && c == 'a'){
				aCountZ++;
			}
		}

		aCount = (aCount * x) + aCountZ;

		return aCount;
	}
}
