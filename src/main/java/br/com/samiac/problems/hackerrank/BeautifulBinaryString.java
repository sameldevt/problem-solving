package br.com.samiac.problems.hackerrank;

public class BeautifulBinaryString {

	/*
		0101010
	 */
	public static int beautifulBinaryString(String b) {

		int changes = 0;

		String sub = "010";

		while (b.contains(sub)) {

			int indexSub = b.indexOf(sub);

			b = b.substring(indexSub + 3);

			changes++;
		}

		return changes;
	}
}
